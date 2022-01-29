package webservice.cliente;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

    public static void main(String[] arqs) throws Exception {

        String conteudo = Request.
                Post("http://localhost:8082/gerenciador/empresas")
                .addHeader("Accept","application/xml")
                .execute()
                .returnContent()
                .toString();

        System.out.println(conteudo);
    }
}
