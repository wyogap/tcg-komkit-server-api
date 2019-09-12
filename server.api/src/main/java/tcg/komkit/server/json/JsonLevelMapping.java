package tcg.komkit.server.json;

public class JsonLevelMapping {
    public int level;

    public String title;

    public String bossTitle;

    public JsonLevelMapping(int level, String title, String bossTitle) {
        this.level = level;
        this.title = title;
        this.bossTitle = bossTitle;
    }
}
