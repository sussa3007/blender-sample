import script.BlenderCommand;
import script.BlenderScript;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)  {

        String txt = BlenderScript.TEST_BLENDER.getScript();
        String scriptPath = "C:\\blender\\script.py" ;


        try {
            // BufferedWriter 와 FileWriter를 조합하여 사용 (속도 향상)
            BufferedWriter fw = new BufferedWriter(new FileWriter(scriptPath, true));

            // 파일안에 문자열 쓰기
            fw.write(txt);
            System.out.println("스크립트 작성 완료!");
            fw.flush();

            // 객체 닫기
            fw.close();


            String command = BlenderCommand.TEST_BLENDER.getCommand();
            Process exec = Runtime.getRuntime().exec(command);
            exec.waitFor();

            Files.delete(Paths.get(scriptPath));

        } catch(IOException e) {
            System.err.println(
                    "Blender:: IOException starting process!");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}