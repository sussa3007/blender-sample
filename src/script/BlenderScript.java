package script;

public enum BlenderScript {
    BASIC("import bpy\n" +
            " \n" +
            "bpy.ops.object.select_all(action=\"SELECT\")\n" +
            "bpy.ops.object.delete()\n" +
            "\n" +
            "vertices = [\n" +
            "    (0, 0, 0),\n" +
            "    (1, 0, 0),\n" +
            "    (1, 1, 0),\n" +
            "    (0, 1, 0),\n" +
            "    (0, 0, 0)\n" +
            "]\n" +
            "edges = [(0,1), (1,2), (2,3), (3,4), (4,5)]\n" +
            "faces = [(0, 1, 2, 3)]\n" +
            "\n" +
            "\n" +
            "new_mesh = bpy.data.meshes.new('new_mesh')\n" +
            "new_mesh.from_pydata(vertices, edges, faces)\n" +
            "new_mesh.update()\n" +
            "\n" +
            "bpy.context.scene.collection.children[0].objects.link(\n" +
            "    bpy.data.objects.new('사각형', new_mesh)\n" +
            ")\n" +
            "\n" +
            "bpy.ops.wm.save_mainfile(filepath=\"C:\\\\blender\\\\bb.obj\")" ),
    TEST_BLENDER("import bpy\n" +
            " \n" +
            "bpy.ops.object.select_all(action=\"SELECT\")\n" +
            " \n" +
            "bpy.ops.object.modifier_add(type='NODES')\n" +
            " \n" +
            //width
            "bpy.context.object.modifiers[\"GeometryNodes\"][\"Input_2\"] = 6\n" +
            " \n" +
            //depth
            "bpy.context.object.modifiers[\"GeometryNodes\"][\"Input_3\" ]= 6\n" +
            " \n" +
            //height
            "bpy.context.object.modifiers[\"GeometryNodes\"][\"Input_4\"] = 6\n" +
            " \n" +
            //Upper_Floor
            "bpy.context.object.modifiers[\"GeometryNodes\"][\"Input_5\"] = 3\n" +
            " \n" +
            //Ring_Frequency
            "bpy.context.object.modifiers[\"GeometryNodes\"][\"Input_6\"] = 2\n" +
            " \n" +
            //V_Gap_Frequency
            "bpy.context.object.modifiers[\"GeometryNodes\"][\"Input_7\"] = 1.000\n" +
            " \n" +
            "bpy.ops.wm.save_mainfile(filepath=\"C:\\\\blender\\\\test.obj\")" );

    final String script;
    BlenderScript(String script) {
        this.script = script;
    }

    public String  getScript() {
        return this.script;
    }
}
