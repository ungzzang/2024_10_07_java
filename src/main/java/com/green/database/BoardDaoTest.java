package com.green.database;

import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        Board board = null;

        if(args.length > 0) {
            board = new Board();
            board.setTitle(args[0]);
            board.setContents(args[1]);
            board.setWriter(args[2]);

            if(args.length == 4) { // 3개까지면 insert, 4개라면 update 라고 알려고.
                board.setBoardId(Integer.parseInt(args[3]));
            }

        }


        //insert(dao, board);
        //selectAll(dao);
        selectOne(dao, 4);
        //update(dao, board);
        //delete(dao);
        //updateDynamic(dao, board);
    }


    private static void insert(BoardDao dao, Board board) {
        int result = dao.insBoard(board);
        System.out.println("result: " + result);
    }

    private static void selectAll(BoardDao dao) {
        List<Board> list = dao.selBoardList();
        for(Board b : list) {
            System.out.println(b);
        }
        //System.out.println(list);
    }

    private static void selectOne(BoardDao dao, int boardId) {
        Board board = dao.selBoardOne(boardId);
        System.out.println(board);
    }

    private static void delete(BoardDao dao) {
        int result = dao.delBoard(2);
        System.out.println("result: " + result);
    }

    private static void update(BoardDao dao, Board board){
        int result = dao.updBoard(board);
        System.out.println("result: " + result);
    }

    private static void updateDynamic(BoardDao dao, Board board){
        int result = dao.updBoard(board);
        System.out.println("result: " + result);
    }
}
