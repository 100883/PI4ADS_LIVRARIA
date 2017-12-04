/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Foto;
import br.com.treebu.model.Idioma;
import br.com.treebu.model.Livro;
import br.com.treebu.util.FabricadeConexao;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;

/**
 *
 * @author vinicius caetano
 */
public class LivroDao implements GenericDao<Livro> {

    private Connection connect;
    private PreparedStatement pstmt;
    private ResultSet resul;
    private Statement stmt;

    private static AutorDao instancia;

    public static synchronized AutorDao getInstancia() throws SQLException {
        if (instancia == null) {
            instancia = new AutorDao();
        }
        return instancia;
    }

    @Override
    public void Cadastrar(Livro livro) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into livro "
                + "(datepublicacao, "
                + "nome_livro, "
                + "desc_livro, "
                + "paginas_livro, "
                + "ano_livro, "
                + "preco_unitario, "
                + "quantidade_livro, "
                + "isbn_livro, "
                + "cod_editora, "
                + "cod_autor, "
                + "cod_genero, "
                + "cod_idioma, "
                + "capa_livro)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setDate(1, new java.sql.Date(livro.getDataPublicacao().getTime()));
        pstmt.setString(2, livro.getNome());
        pstmt.setString(3, livro.getDescricao());
        pstmt.setInt(4, livro.getNumeroPaginas());
        pstmt.setInt(5, livro.getAno());
        pstmt.setDouble(6, livro.getPreco());
        pstmt.setInt(7, livro.getQtd_livro());
        pstmt.setString(8, livro.getIsbn());
        pstmt.setInt(9, livro.getEditora().getCodigo());
        pstmt.setInt(10, livro.getAutor().getCodigo());
        pstmt.setInt(11, livro.getGenero().getCodigo());
        pstmt.setInt(12, livro.getIdioma().getCodigo());
        pstmt.setString(13, livro.getCapa());

        pstmt.executeUpdate();
    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from livro "
                + "where cod_livro=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();

    }

    @Override
    public void Atualizar(Livro livro) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update livro set "
                + "datepublicacao = ?,"
                + "nome_livro = ?,"
                + "desc_livro = ?,"
                + "paginas_livro = ?,"
                + "ano_livro = ?,"
                + "preco_unitario = ?,"
                + "quantidade_livro = ?,"
                + "isbn_livro = ?,"
                + "capa_livro = ?,"
                + "cod_editora = ?,"
                + "cod_autor = ?,"
                + "cod_genero = ?,"
                + "cod_idioma = ? "
                + "where cod_livro=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setDate(1, new java.sql.Date(livro.getDataPublicacao().getTime()));
        pstmt.setString(2, livro.getNome());
        pstmt.setString(3, livro.getDescricao());
        pstmt.setInt(4, livro.getNumeroPaginas());
        pstmt.setInt(5, livro.getAno());
        pstmt.setDouble(6, livro.getPreco());
        pstmt.setInt(7, livro.getQtd_livro());
        pstmt.setString(8, livro.getIsbn());
        pstmt.setString(9, livro.getCapa());
        pstmt.setInt(10, livro.getEditora().getCodigo());
        pstmt.setInt(11, livro.getAutor().getCodigo());
        pstmt.setInt(12, livro.getGenero().getCodigo());
        pstmt.setInt(13, livro.getIdioma().getCodigo());

        pstmt.setInt(14, livro.getCodigo());

        pstmt.executeUpdate();

    }

    @Override
    public List<Livro> Listar() throws Exception, SQLException {

        List<Livro> livroList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from livro l, editora e where l.cod_editora = e.cod_edi";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Livro livro = new Livro();

            livro.setCodigo(resul.getInt("cod_livro"));
            livro.setDataPublicacao(resul.getDate("datepublicacao"));
            livro.setNome(resul.getString("nome_livro"));
            livro.setDescricao(resul.getString("desc_livro"));
            livro.setNumeroPaginas(resul.getInt("paginas_livro"));
            livro.setAno(resul.getInt("ano_livro"));
            livro.setPreco(resul.getDouble("preco_unitario"));
            livro.setQtd_livro(resul.getInt("quantidade_livro"));
            livro.setIsbn(resul.getString("isbn_livro"));
            livro.setCapa(resul.getString("capa_livro"));

            EditoraDao editoraDAO = new EditoraDao();
            livro.setEditora(editoraDAO.ConsultarPorCodigo(resul.getInt("cod_edi")));
            AutorDao autorDAO = new AutorDao();
            livro.setAutor(autorDAO.ConsultarPorCodigo(resul.getInt("cod_aut")));
            GeneroDao generoDAO = new GeneroDao();
            livro.setGenero(generoDAO.ConsultarPorCodigo(resul.getInt("cod_gen")));
            IdiomaDao idiomaDAO = new IdiomaDao();
            livro.setIdioma(idiomaDAO.ConsultarPorCodigo(resul.getInt("cod_idi")));

            livroList.add(livro);
        }

        return livroList;
    }

    public Iterator<Livro> ListarIterator() throws Exception {
        List<Livro> livroList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from idioma";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Livro livro = new Livro();

            livro.setCodigo(resul.getInt("cod_livro"));
            livro.setDataPublicacao(resul.getDate("datepublicacao"));
            livro.setNome(resul.getString("nome_livro"));
            livro.setDescricao(resul.getString("desc_livro"));
            livro.setNumeroPaginas(resul.getInt("paginas_livro"));
            livro.setAno(resul.getInt("ano_livro"));
            livro.setPreco(resul.getDouble("preco_unitario"));
            livro.setQtd_livro(resul.getInt("quantidade_livro"));
            livro.setIsbn(resul.getString("isbn_livro"));
            livro.setCapa(resul.getString("capa_livro"));

            EditoraDao editoraDAO = new EditoraDao();
            livro.setEditora(editoraDAO.ConsultarPorCodigo(resul.getInt("cod_edi")));
            AutorDao autorDAO = new AutorDao();
            livro.setAutor(autorDAO.ConsultarPorCodigo(resul.getInt("cod_aut")));
            GeneroDao generoDAO = new GeneroDao();
            livro.setGenero(generoDAO.ConsultarPorCodigo(resul.getInt("cod_gen")));
            IdiomaDao idiomaDAO = new IdiomaDao();
            livro.setIdioma(idiomaDAO.ConsultarPorCodigo(resul.getInt("cod_idi")));

            livroList.add(livro);

        }
        return livroList.iterator();
    }

    @Override
    public Livro ConsultarPorCodigo(int codigo) throws Exception, SQLException {

        Livro livro = new Livro();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from livro"
                + " where cod_livro=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            livro.setCodigo(resul.getInt("cod_livro"));

            livro.setDataPublicacao(resul.getDate("datepublicacao"));
            livro.setNome(resul.getString("nome_livro"));
            livro.setDescricao(resul.getString("desc_livro"));
            livro.setNumeroPaginas(resul.getInt("paginas_livro"));
            livro.setAno(resul.getInt("ano_livro"));
            livro.setPreco(resul.getDouble("preco_unitario"));
            livro.setQtd_livro(resul.getInt("quantidade_livro"));
            livro.setIsbn(resul.getString("isbn_livro"));
            livro.setCapa(resul.getString("capa_livro"));

            EditoraDao editoraDAO = new EditoraDao();
            livro.setEditora(editoraDAO.ConsultarPorCodigo(resul.getInt("cod_edi")));
            AutorDao autorDAO = new AutorDao();
            livro.setAutor(autorDAO.ConsultarPorCodigo(resul.getInt("cod_aut")));
            GeneroDao generoDAO = new GeneroDao();
            livro.setGenero(generoDAO.ConsultarPorCodigo(resul.getInt("cod_gen")));
            IdiomaDao idiomaDAO = new IdiomaDao();
            livro.setIdioma(idiomaDAO.ConsultarPorCodigo(resul.getInt("cod_idi")));
        }

        return livro;
    }

    public void salvarImagem(String imagem) throws FileNotFoundException, IOException, SQLException, Exception {
        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into imagem ";
        pstmt = connect.prepareStatement(sql);

        File imagemFile = new File(imagem);
        byte[] imagemArray = new byte[(int) imagemFile.length()];
        DataInputStream imagemStream = new DataInputStream(
                new FileInputStream(imagemFile));
        imagemStream.readFully(imagemArray);
        imagemStream.close();
        pstmt.setBytes(1, imagemArray);
        pstmt.executeUpdate();
    }

    public List<Livro> ListaHome() throws Exception, SQLException {

        List<Livro> livroList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select nome_livro, desc_livro, preco_unitario from livro";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Livro livro = new Livro();
            livro.setNome(resul.getString("nome_livro"));
            livro.setDescricao(resul.getString("desc_livro"));
            livro.setPreco(resul.getDouble("preco_unitario"));

            livroList.add(livro);
        }

        return livroList;
    }

    /**
     *
     * @param item FileItem, representa um arquivo que é enviado pelo formulario
     *
     * MultiPart/Form-data
     *
     * @throws IOException
     *
     * @throws ServletException
     *
     */
    private void inserirImagem(FileItem item) throws Exception {

        Connection conexao = null;

        connect = FabricadeConexao.getInstancia().getConexao();

        String sql = "INSERT INTO foto (codigo, imagem) VALUES(?, ?)";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        try {
            Foto foto = new Foto();
            pstmt.setInt(1, foto.getCodigo()); // codigo 1
            pstmt.setBinaryStream(2, item.getInputStream(),
                    (int) item.getSize());

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
