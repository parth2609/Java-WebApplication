
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Welcome implements Servlet
{

    /**
     *
     * @param rq
     * @param rs
     */
    @Override
    public void service(ServletRequest rq, ServletResponse rs){
        rs.setContentType("text");
        String u=rq.getParameter("username");
        try{
            PrintWriter pw=rs.getWriter();
            pw.println("Welcome"+"\t"+u);
        }
        catch(IOException e)
        {
    }
            }

    /**
     *
     * @param sc
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig sc) throws ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    