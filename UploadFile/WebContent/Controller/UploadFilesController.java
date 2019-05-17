package Controller;
import static spark.Spark.*;

public class UploadFilesController {
	public UploadFilesControler(final UploadFilesService UploadServico) {
		get("/index", (req, res) -> UploadServico.ListarArquivos());
		put("/index:data", (req, res) -> UploadServico.InserirArquivo(req.params(":data")));
	}
}
