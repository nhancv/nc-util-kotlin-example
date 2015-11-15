import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

@Suppress("UNUSED_FUNCTION_LITERAL")
        /**
 * Created by NhanCao on 15-Nov-15.
 */
fun main(agrs: Array<String>){
    val inputstream = Files.newBufferedReader(Paths.get("input.txt"), StandardCharsets.UTF_8).buffered().lines();
    val outstr=Files.newBufferedWriter(Paths.get("output.txt"),StandardCharsets.UTF_8);

    inputstream.forEach {
        val s:String = it.trim();
        outstr.write("'"+s+"',");
        outstr.newLine();
    };


    outstr.close();
    inputstream.close();

}
