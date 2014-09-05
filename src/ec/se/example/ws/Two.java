package ec.se.example.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace="http://sri.gob.ec/wsConsultaEstablecimientos")
public class Two {
	public List<String> execute(@WebParam(name = "B") String b,
			@WebParam(name = "X") String x, @WebParam(name = "Y") String y) {
		List<String> retorno = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			retorno.add(b.concat(" " + Integer.toString(i)));
			retorno.add(x.concat(" " + Integer.toString(i)));
			retorno.add(y.concat(" " + Integer.toString(i)));
		}
		return retorno;
	}
}
