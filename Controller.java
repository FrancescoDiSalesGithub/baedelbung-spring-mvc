@Controller
public class SampleController {
    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }

}
