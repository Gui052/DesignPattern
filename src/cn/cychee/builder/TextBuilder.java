package cn.cychee.builder;

public class TextBuilder extends Builder {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append("============================\n");
        stringBuilder.append("[").append(title).append("]\n");
        stringBuilder.append("\n");
    }

    @Override
    public void makeString(String string) {
        stringBuilder.append("[]").append(string).append("\n");
        stringBuilder.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            stringBuilder.append(" -").append(item).append("\n");
        }
        stringBuilder.append("\n");
    }

    @Override
    public void close() {
        stringBuilder.append("=======================================\n");
    }

    public String getResult() {
        return stringBuilder.toString();
    }
}
