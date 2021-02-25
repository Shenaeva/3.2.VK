package ry.netology.domain;

public class Like {
    private int count; // информация о количестве поставленных лайков
    private boolean userLike; // наличие отметки лайка текущего пользователя
    private boolean canLike; // информация о то, может ли текущий пользователь поставить отметку
    private boolean canRepost; // информация о то, может ли текущий пользователь сделать репост записи
}
