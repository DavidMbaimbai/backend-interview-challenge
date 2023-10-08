
import com.bp3.service.DiagramService;




public class App {
    public static void main(String[] args) {
        DiagramService diagramService = new DiagramService();
        diagramService.processAllFiles("data");
    }


}

