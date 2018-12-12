package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
    public static String toUpperCase(String text){
    return text.toUpperCase();
    }
    public static String toLowerCase(String text){
        return  text.toLowerCase();
    }
    public static String addSlash(String text){
        return "/" + text;
    }
}
