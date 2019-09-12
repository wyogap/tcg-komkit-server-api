package tcg.komkit.server.command.json;

public class JsonException extends Exception {
	private static final long serialVersionUID = 3454793934188089261L;

	public EStatusCode statusCode = EStatusCode.NOERROR;
	public String statusMessage = null;
		
	public JsonException(EStatusCode code, String message) {
		this.statusCode = code;
		this.statusMessage = message;
	}
}
