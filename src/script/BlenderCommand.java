package script;

public enum BlenderCommand {
    BASIC("\"C:\\Program Files\\Blender Foundation\\Blender 3.4\\blender.exe\" --background --python C:\\blender\\script.py"),
    TEST_BLENDER("\"C:\\Program Files\\Blender Foundation\\Blender 3.4\\blender.exe\" --background C:\\blender\\Building_node\\KPB-BrickHouseElements-modified_v02.blend --python C:\\blender\\script.py"),;

    final String command;
    BlenderCommand(String command) {
        this.command = command;
    }

    public String  getCommand() {
        return this.command;
    }
}
