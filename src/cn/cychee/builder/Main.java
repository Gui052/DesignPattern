package cn.cychee.builder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }
        if (args[0].equals("html")) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName);
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage:          Java Main plain   编写纯文本文档");
        System.out.println("Usage:          Java Main html    编写HTML文档");
    }
}
