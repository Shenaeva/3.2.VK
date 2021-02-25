package ry.netology.domain;

public class CommentsInfo {
    private boolean canComment; // признак возможности написать комментарий
    private int count; // колличество комментариев
    private int id; // id комментария
    private String userName; // автор комментария
    private String text; // текст комментария
    private String attachment; //вложения к комментарию
    private int likeComment; //количество лайков комментария

}
