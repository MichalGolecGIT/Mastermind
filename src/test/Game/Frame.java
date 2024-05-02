package Game;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame extends JFrame {

    private JPanel contentPane;

    ArrayList<Integer> CODE_COLOR_VAR = new ArrayList<Integer>();
    ArrayList<Integer> GUESS_COLOR_VAR = new ArrayList<Integer>();
    int X_POSITION_LAST_TRY_VAR = 140;
    int NOUMBERS_OF_COLOR = 6;
    int MAX_NOUMBERS_OF_COLOR = 8;
    int MIN_NOUMBERS_OF_COLOR = 4;
    int MAX_NOUMBERS_OF_ROUNDS = 12;
    int MIN_NOUMBERS_OF_ROUNDS = 5;
    int NOUMBER_OF_ROUNDS = 8;
    int COURENT_ROUND = 0;
    boolean WIN = false;
    //JButton ADD_BTN = new JButton("Add");
    JTextArea areaNazwa = new JTextArea("Nazwa");
    JTextArea areaID = new JTextArea("Ilosc");


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Frame frame = new Frame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 720);
        contentPane = new JPanel();
        contentPane.setBackground(Color.darkGray);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

       // ADD_BTN.setBounds(540, 520, 200, 80);
       // ADD_BTN.setBackground(Color.WHITE);
       // contentPane.add(ADD_BTN);
//
//
//
//
//        areaNazwa.setBounds(10,30, 200,20);
//        contentPane.add(areaNazwa);
//        areaID.setBounds(10,70, 200,20);
//        contentPane.add(areaID);
//
//        ADD_BTN.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String txt = areaNazwa.getText();
//                Integer number = new Integer(areaID.getText());
//            }
//        });


        //USER INTERFACE

        JButton START_BTN = new JButton("START");

        START_BTN.setBounds(430, 520, 200, 80);
        START_BTN.setBackground(Color.WHITE);
        contentPane.add(START_BTN);

        JButton NOUMBER_OF_COLORS_BTN = new JButton("COLORS:6");

        NOUMBER_OF_COLORS_BTN.setBounds(630, 520, 100, 80);
        NOUMBER_OF_COLORS_BTN.setBackground(Color.WHITE);
        contentPane.add(NOUMBER_OF_COLORS_BTN);

        JButton NOUMBER_OF_ROUNDS_BTN = new JButton("ROUNDS:8");

        NOUMBER_OF_ROUNDS_BTN.setBounds(730, 520, 120, 80);
        NOUMBER_OF_ROUNDS_BTN.setBackground(Color.WHITE);
        contentPane.add(NOUMBER_OF_ROUNDS_BTN);

        JButton CODE_OK_BTN = new JButton("OK");

        CODE_OK_BTN.setBounds(490, 520, 200, 80);
        CODE_OK_BTN.setBackground(Color.WHITE);
        CODE_OK_BTN.setVisible(false);


        JButton AI_BTN = new JButton("vs AI");

        AI_BTN.setBounds(690, 520, 100, 80);
        AI_BTN.setBackground(Color.WHITE);
        AI_BTN.setVisible(false);


        JButton GUESS_OK_BTN = new JButton("OK");

        GUESS_OK_BTN.setBounds(490, 520, 300, 80);
        GUESS_OK_BTN.setBackground(Color.RED);
        GUESS_OK_BTN.setVisible(false);


        //CODE BUTTONS

        JButton CODE_COLOR_1_BTN = new JButton("");
        CODE_COLOR_1_BTN.setBounds(1150, 80, 80, 80);
        CODE_COLOR_1_BTN.setBackground(Color.BLUE);
        CODE_COLOR_1_BTN.setVisible(false);


        JButton CODE_COLOR_2_BTN = new JButton("");
        CODE_COLOR_2_BTN.setBounds(1150, 170, 80, 80);
        CODE_COLOR_2_BTN.setBackground(Color.BLUE);
        CODE_COLOR_2_BTN.setVisible(false);


        JButton CODE_COLOR_3_BTN = new JButton("");
        CODE_COLOR_3_BTN.setBounds(1150, 260, 80, 80);
        CODE_COLOR_3_BTN.setBackground(Color.BLUE);
        CODE_COLOR_3_BTN.setVisible(false);


        JButton CODE_COLOR_4_BTN = new JButton("");
        CODE_COLOR_4_BTN.setBounds(1150, 350, 80, 80);
        CODE_COLOR_4_BTN.setBackground(Color.BLUE);
        CODE_COLOR_4_BTN.setVisible(false);


        //GUESS BUTTONS

        JButton GUESS_COLOR_1_BTN = new JButton("");
        GUESS_COLOR_1_BTN.setBounds(40, 80, 80, 80);
        GUESS_COLOR_1_BTN.setBackground(Color.BLUE);
        GUESS_COLOR_1_BTN.setVisible(false);


        JButton GUESS_COLOR_2_BTN = new JButton("");
        GUESS_COLOR_2_BTN.setBounds(40, 170, 80, 80);
        GUESS_COLOR_2_BTN.setBackground(Color.BLUE);
        GUESS_COLOR_2_BTN.setVisible(false);


        JButton GUESS_COLOR_3_BTN = new JButton("");
        GUESS_COLOR_3_BTN.setBounds(40, 260, 80, 80);
        GUESS_COLOR_3_BTN.setBackground(Color.BLUE);
        GUESS_COLOR_3_BTN.setVisible(false);


        JButton GUESS_COLOR_4_BTN = new JButton("");
        GUESS_COLOR_4_BTN.setBounds(40, 350, 80, 80);
        GUESS_COLOR_4_BTN.setBackground(Color.BLUE);
        GUESS_COLOR_4_BTN.setVisible(false);


        //USER ACTIONS

        START_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.add(CODE_OK_BTN);
                contentPane.add(AI_BTN);
                contentPane.add(CODE_COLOR_1_BTN);
                contentPane.add(CODE_COLOR_2_BTN);
                contentPane.add(CODE_COLOR_3_BTN);
                contentPane.add(CODE_COLOR_4_BTN);


                CODE_COLOR_1_BTN.setVisible(true);
                CODE_COLOR_1_BTN.setEnabled(true);
                CODE_COLOR_2_BTN.setVisible(true);
                CODE_COLOR_2_BTN.setEnabled(true);
                CODE_COLOR_3_BTN.setVisible(true);
                CODE_COLOR_3_BTN.setEnabled(true);
                CODE_COLOR_4_BTN.setVisible(true);
                CODE_COLOR_4_BTN.setEnabled(true);
                for (int a = 0; a < 4; a++) {
                    CODE_COLOR_VAR.add(0);
                    GUESS_COLOR_VAR.add(0);
                }
                START_BTN.setVisible(false);
                NOUMBER_OF_COLORS_BTN.setVisible(false);
                NOUMBER_OF_ROUNDS_BTN.setVisible(false);

                CODE_OK_BTN.setVisible(true);
                AI_BTN.setVisible(true);
            }
        });

        AI_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.add(GUESS_OK_BTN);

                contentPane.add(GUESS_COLOR_1_BTN);
                contentPane.add(GUESS_COLOR_2_BTN);
                contentPane.add(GUESS_COLOR_3_BTN);
                contentPane.add(GUESS_COLOR_4_BTN);


                GUESS_COLOR_1_BTN.setVisible(true);
                GUESS_COLOR_2_BTN.setVisible(true);
                GUESS_COLOR_3_BTN.setVisible(true);
                GUESS_COLOR_4_BTN.setVisible(true);
                contentPane.repaint();
                GUESS_OK_BTN.setVisible(true);


                GUESS_COLOR_1_BTN.setVisible(true);
                GUESS_COLOR_2_BTN.setVisible(true);
                GUESS_COLOR_3_BTN.setVisible(true);
                GUESS_COLOR_4_BTN.setVisible(true);

                GUESS_OK_BTN.setVisible(true);

                CODE_COLOR_VAR = Gameplay.random(NOUMBERS_OF_COLOR);

                CODE_COLOR_1_BTN.setVisible(false);
                if (CODE_COLOR_VAR.get(0) == 0) {
                    CODE_COLOR_1_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(0) == 1) {
                    CODE_COLOR_1_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(0) == 2) {
                    CODE_COLOR_1_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(0) == 3) {
                    CODE_COLOR_1_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(0) == 4) {
                    CODE_COLOR_1_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(0) == 5) {
                    CODE_COLOR_1_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(0) == 6) {
                    CODE_COLOR_1_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(0) == 7) {
                    CODE_COLOR_1_BTN.setBackground(Color.CYAN);
                }
                CODE_COLOR_2_BTN.setVisible(false);
                if (CODE_COLOR_VAR.get(1) == 0) {
                    CODE_COLOR_2_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(1) == 1) {
                    CODE_COLOR_2_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(1) == 2) {
                    CODE_COLOR_2_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(1) == 3) {
                    CODE_COLOR_2_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(1) == 4) {
                    CODE_COLOR_2_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(1) == 5) {
                    CODE_COLOR_2_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(1) == 6) {
                    CODE_COLOR_2_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(1) == 7) {
                    CODE_COLOR_2_BTN.setBackground(Color.CYAN);
                }
                CODE_COLOR_3_BTN.setVisible(false);
                if (CODE_COLOR_VAR.get(2) == 0) {
                    CODE_COLOR_3_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(2) == 1) {
                    CODE_COLOR_3_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(2) == 2) {
                    CODE_COLOR_3_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(2) == 3) {
                    CODE_COLOR_3_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(2) == 4) {
                    CODE_COLOR_3_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(2) == 5) {
                    CODE_COLOR_3_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(2) == 6) {
                    CODE_COLOR_3_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(2) == 7) {
                    CODE_COLOR_3_BTN.setBackground(Color.CYAN);
                }
                CODE_COLOR_4_BTN.setVisible(false);
                if (CODE_COLOR_VAR.get(3) == 0) {
                    CODE_COLOR_4_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(3) == 1) {
                    CODE_COLOR_4_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(3) == 2) {
                    CODE_COLOR_4_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(3) == 3) {
                    CODE_COLOR_4_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(3) == 4) {
                    CODE_COLOR_4_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(3) == 5) {
                    CODE_COLOR_4_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(3) == 6) {
                    CODE_COLOR_4_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(3) == 7) {
                    CODE_COLOR_4_BTN.setBackground(Color.CYAN);
                }

                CODE_OK_BTN.setVisible(false);
                AI_BTN.setVisible(false);

            }
        });
        CODE_OK_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.add(GUESS_OK_BTN);

                contentPane.add(GUESS_COLOR_1_BTN);
                contentPane.add(GUESS_COLOR_2_BTN);
                contentPane.add(GUESS_COLOR_3_BTN);
                contentPane.add(GUESS_COLOR_4_BTN);


                GUESS_COLOR_1_BTN.setVisible(true);
                GUESS_COLOR_2_BTN.setVisible(true);
                GUESS_COLOR_3_BTN.setVisible(true);
                GUESS_COLOR_4_BTN.setVisible(true);
                contentPane.repaint();
                GUESS_OK_BTN.setVisible(true);


                CODE_COLOR_1_BTN.setVisible(false);
                CODE_COLOR_2_BTN.setVisible(false);
                CODE_COLOR_3_BTN.setVisible(false);
                CODE_COLOR_4_BTN.setVisible(false);

                CODE_OK_BTN.setVisible(false);
                AI_BTN.setVisible(false);

            }
        });
        NOUMBER_OF_COLORS_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NOUMBERS_OF_COLOR++;
                if (NOUMBERS_OF_COLOR > MAX_NOUMBERS_OF_COLOR) {
                    NOUMBERS_OF_COLOR = MIN_NOUMBERS_OF_COLOR;
                }
                if (NOUMBERS_OF_COLOR == 4) {
                    NOUMBER_OF_COLORS_BTN.setText("COLORS:4");
                } else if (NOUMBERS_OF_COLOR == 5) {
                    NOUMBER_OF_COLORS_BTN.setText("COLORS:5");
                } else if (NOUMBERS_OF_COLOR == 6) {
                    NOUMBER_OF_COLORS_BTN.setText("COLORS:6");
                } else if (NOUMBERS_OF_COLOR == 7) {
                    NOUMBER_OF_COLORS_BTN.setText("COLORS:7");
                } else if (NOUMBERS_OF_COLOR == 8) {
                    NOUMBER_OF_COLORS_BTN.setText("COLORS:8");
                }


            }
        });
        NOUMBER_OF_ROUNDS_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NOUMBER_OF_ROUNDS++;
                if (NOUMBER_OF_ROUNDS > MAX_NOUMBERS_OF_ROUNDS) {
                    NOUMBER_OF_ROUNDS = MIN_NOUMBERS_OF_ROUNDS;
                }
                if (NOUMBER_OF_ROUNDS == 5) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:5");
                } else if (NOUMBER_OF_ROUNDS == 6) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:6");
                } else if (NOUMBER_OF_ROUNDS == 7) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:7");
                } else if (NOUMBER_OF_ROUNDS == 8) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:8");
                } else if (NOUMBER_OF_ROUNDS == 9) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:9");
                } else if (NOUMBER_OF_ROUNDS == 10) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:10");
                } else if (NOUMBER_OF_ROUNDS == 11) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:11");
                } else if (NOUMBER_OF_ROUNDS == 12) {
                    NOUMBER_OF_ROUNDS_BTN.setText("ROUNDS:12");
                }


            }
        });


        // GAME ACTIONS

        CODE_COLOR_1_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CODE_COLOR_VAR.set(0, CODE_COLOR_VAR.get(0) + 1);
                if (CODE_COLOR_VAR.get(0) >= NOUMBERS_OF_COLOR) {
                    CODE_COLOR_VAR.set(0, 0);
                }
                if (CODE_COLOR_VAR.get(0) == 0) {
                    CODE_COLOR_1_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(0) == 1) {
                    CODE_COLOR_1_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(0) == 2) {
                    CODE_COLOR_1_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(0) == 3) {
                    CODE_COLOR_1_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(0) == 4) {
                    CODE_COLOR_1_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(0) == 5) {
                    CODE_COLOR_1_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(0) == 6) {
                    CODE_COLOR_1_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(0) == 7) {
                    CODE_COLOR_1_BTN.setBackground(Color.CYAN);
                }

            }
        });
        CODE_COLOR_2_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CODE_COLOR_VAR.set(1, CODE_COLOR_VAR.get(1) + 1);
                if (CODE_COLOR_VAR.get(1) >= NOUMBERS_OF_COLOR) {
                    CODE_COLOR_VAR.set(1, 0);
                }
                if (CODE_COLOR_VAR.get(1) == 0) {
                    CODE_COLOR_2_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(1) == 1) {
                    CODE_COLOR_2_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(1) == 2) {
                    CODE_COLOR_2_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(1) == 3) {
                    CODE_COLOR_2_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(1) == 4) {
                    CODE_COLOR_2_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(1) == 5) {
                    CODE_COLOR_2_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(1) == 6) {
                    CODE_COLOR_2_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(1) == 7) {
                    CODE_COLOR_2_BTN.setBackground(Color.CYAN);
                }

            }
        });
        CODE_COLOR_3_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CODE_COLOR_VAR.set(2, CODE_COLOR_VAR.get(2) + 1);
                if (CODE_COLOR_VAR.get(2) >= NOUMBERS_OF_COLOR) {
                    CODE_COLOR_VAR.set(2, 0);
                }
                if (CODE_COLOR_VAR.get(2) == 0) {
                    CODE_COLOR_3_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(2) == 1) {
                    CODE_COLOR_3_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(2) == 2) {
                    CODE_COLOR_3_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(2) == 3) {
                    CODE_COLOR_3_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(2) == 4) {
                    CODE_COLOR_3_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(2) == 5) {
                    CODE_COLOR_3_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(2) == 6) {
                    CODE_COLOR_3_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(2) == 7) {
                    CODE_COLOR_3_BTN.setBackground(Color.CYAN);
                }

            }
        });
        CODE_COLOR_4_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CODE_COLOR_VAR.set(3, CODE_COLOR_VAR.get(3) + 1);
                if (CODE_COLOR_VAR.get(3) >= NOUMBERS_OF_COLOR) {
                    CODE_COLOR_VAR.set(3, 0);
                }
                if (CODE_COLOR_VAR.get(3) == 0) {
                    CODE_COLOR_4_BTN.setBackground(Color.BLUE);
                } else if (CODE_COLOR_VAR.get(3) == 1) {
                    CODE_COLOR_4_BTN.setBackground(Color.YELLOW);
                } else if (CODE_COLOR_VAR.get(3) == 2) {
                    CODE_COLOR_4_BTN.setBackground(Color.PINK);
                } else if (CODE_COLOR_VAR.get(3) == 3) {
                    CODE_COLOR_4_BTN.setBackground(Color.RED);
                } else if (CODE_COLOR_VAR.get(3) == 4) {
                    CODE_COLOR_4_BTN.setBackground(Color.GREEN);
                } else if (CODE_COLOR_VAR.get(3) == 5) {
                    CODE_COLOR_4_BTN.setBackground(Color.ORANGE);
                } else if (CODE_COLOR_VAR.get(3) == 6) {
                    CODE_COLOR_4_BTN.setBackground(Color.MAGENTA);
                } else if (CODE_COLOR_VAR.get(3) == 7) {
                    CODE_COLOR_4_BTN.setBackground(Color.CYAN);
                }

            }
        });

        GUESS_COLOR_1_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUESS_COLOR_VAR.set(0, GUESS_COLOR_VAR.get(0) + 1);
                if (GUESS_COLOR_VAR.get(0) >= NOUMBERS_OF_COLOR) {
                    GUESS_COLOR_VAR.set(0, 0);
                }
                if (GUESS_COLOR_VAR.get(0) == 0) {
                    GUESS_COLOR_1_BTN.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(0) == 1) {
                    GUESS_COLOR_1_BTN.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(0) == 2) {
                    GUESS_COLOR_1_BTN.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(0) == 3) {
                    GUESS_COLOR_1_BTN.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(0) == 4) {
                    GUESS_COLOR_1_BTN.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(0) == 5) {
                    GUESS_COLOR_1_BTN.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(0) == 6) {
                    GUESS_COLOR_1_BTN.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(0) == 7) {
                    GUESS_COLOR_1_BTN.setBackground(Color.CYAN);
                }

            }
        });
        GUESS_COLOR_2_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUESS_COLOR_VAR.set(1, GUESS_COLOR_VAR.get(1) + 1);
                if (GUESS_COLOR_VAR.get(1) >= NOUMBERS_OF_COLOR) {
                    GUESS_COLOR_VAR.set(1, 0);
                }
                if (GUESS_COLOR_VAR.get(1) == 0) {
                    GUESS_COLOR_2_BTN.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(1) == 1) {
                    GUESS_COLOR_2_BTN.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(1) == 2) {
                    GUESS_COLOR_2_BTN.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(1) == 3) {
                    GUESS_COLOR_2_BTN.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(1) == 4) {
                    GUESS_COLOR_2_BTN.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(1) == 5) {
                    GUESS_COLOR_2_BTN.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(1) == 6) {
                    GUESS_COLOR_2_BTN.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(1) == 7) {
                    GUESS_COLOR_2_BTN.setBackground(Color.CYAN);
                }

            }
        });
        GUESS_COLOR_3_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUESS_COLOR_VAR.set(2, GUESS_COLOR_VAR.get(2) + 1);
                if (GUESS_COLOR_VAR.get(2) >= NOUMBERS_OF_COLOR) {
                    GUESS_COLOR_VAR.set(2, 0);
                }
                if (GUESS_COLOR_VAR.get(2) == 0) {
                    GUESS_COLOR_3_BTN.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(2) == 1) {
                    GUESS_COLOR_3_BTN.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(2) == 2) {
                    GUESS_COLOR_3_BTN.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(2) == 3) {
                    GUESS_COLOR_3_BTN.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(2) == 4) {
                    GUESS_COLOR_3_BTN.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(2) == 5) {
                    GUESS_COLOR_3_BTN.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(2) == 6) {
                    GUESS_COLOR_3_BTN.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(2) == 7) {
                    GUESS_COLOR_3_BTN.setBackground(Color.CYAN);
                }

            }
        });
        GUESS_COLOR_4_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUESS_COLOR_VAR.set(3, GUESS_COLOR_VAR.get(3) + 1);
                if (GUESS_COLOR_VAR.get(3) >= NOUMBERS_OF_COLOR) {
                    GUESS_COLOR_VAR.set(3, 0);
                }
                if (GUESS_COLOR_VAR.get(3) == 0) {
                    GUESS_COLOR_4_BTN.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(3) == 1) {
                    GUESS_COLOR_4_BTN.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(3) == 2) {
                    GUESS_COLOR_4_BTN.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(3) == 3) {
                    GUESS_COLOR_4_BTN.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(3) == 4) {
                    GUESS_COLOR_4_BTN.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(3) == 5) {
                    GUESS_COLOR_4_BTN.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(3) == 6) {
                    GUESS_COLOR_4_BTN.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(3) == 7) {
                    GUESS_COLOR_4_BTN.setBackground(Color.CYAN);
                }

            }
        });

        GUESS_OK_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Integer> result = Gameplay.main(CODE_COLOR_VAR, GUESS_COLOR_VAR);
                WIN = Gameplay.win(result);
                COURENT_ROUND++;


                JButton LAST_TRY_1 = new JButton("");
                LAST_TRY_1.setBounds(X_POSITION_LAST_TRY_VAR, 95, 50, 50);

                if (GUESS_COLOR_VAR.get(0) == 0) {
                    LAST_TRY_1.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(0) == 1) {
                    LAST_TRY_1.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(0) == 2) {
                    LAST_TRY_1.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(0) == 3) {
                    LAST_TRY_1.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(0) == 4) {
                    LAST_TRY_1.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(0) == 5) {
                    LAST_TRY_1.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(0) == 6) {
                    LAST_TRY_1.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(0) == 7) {
                    LAST_TRY_1.setBackground(Color.CYAN);
                }

                JButton LAST_TRY_2 = new JButton("");
                LAST_TRY_2.setBounds(X_POSITION_LAST_TRY_VAR, 185, 50, 50);

                if (GUESS_COLOR_VAR.get(1) == 0) {
                    LAST_TRY_2.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(1) == 1) {
                    LAST_TRY_2.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(1) == 2) {
                    LAST_TRY_2.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(1) == 3) {
                    LAST_TRY_2.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(1) == 4) {
                    LAST_TRY_2.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(1) == 5) {
                    LAST_TRY_2.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(1) == 6) {
                    LAST_TRY_2.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(1) == 7) {
                    LAST_TRY_2.setBackground(Color.CYAN);
                }


                JButton LAST_TRY_3 = new JButton("");
                LAST_TRY_3.setBounds(X_POSITION_LAST_TRY_VAR, 275, 50, 50);

                if (GUESS_COLOR_VAR.get(2) == 0) {
                    LAST_TRY_3.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(2) == 1) {
                    LAST_TRY_3.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(2) == 2) {
                    LAST_TRY_3.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(2) == 3) {
                    LAST_TRY_3.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(2) == 4) {
                    LAST_TRY_3.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(2) == 5) {
                    LAST_TRY_3.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(2) == 6) {
                    LAST_TRY_3.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(2) == 7) {
                    LAST_TRY_3.setBackground(Color.CYAN);
                }

                JButton LAST_TRY_4 = new JButton("");
                LAST_TRY_4.setBounds(X_POSITION_LAST_TRY_VAR, 365, 50, 50);

                if (GUESS_COLOR_VAR.get(3) == 0) {
                    LAST_TRY_4.setBackground(Color.BLUE);
                } else if (GUESS_COLOR_VAR.get(3) == 1) {
                    LAST_TRY_4.setBackground(Color.YELLOW);
                } else if (GUESS_COLOR_VAR.get(3) == 2) {
                    LAST_TRY_4.setBackground(Color.PINK);
                } else if (GUESS_COLOR_VAR.get(3) == 3) {
                    LAST_TRY_4.setBackground(Color.RED);
                } else if (GUESS_COLOR_VAR.get(3) == 4) {
                    LAST_TRY_4.setBackground(Color.GREEN);
                } else if (GUESS_COLOR_VAR.get(3) == 5) {
                    LAST_TRY_4.setBackground(Color.ORANGE);
                } else if (GUESS_COLOR_VAR.get(3) == 6) {
                    LAST_TRY_4.setBackground(Color.MAGENTA);
                } else if (GUESS_COLOR_VAR.get(3) == 7) {
                    LAST_TRY_4.setBackground(Color.CYAN);
                }

                JButton RESULT_1 = new JButton("");
                RESULT_1.setBounds(X_POSITION_LAST_TRY_VAR, 425, 20, 20);
                if (result.get(0) == 2) {
                    RESULT_1.setBackground(Color.BLACK);
                } else if (result.get(0) == 1) {
                    RESULT_1.setBackground(Color.WHITE);
                } else {
                    RESULT_1.setVisible(false);
                }
                JButton RESULT_2 = new JButton("");
                RESULT_2.setBounds(X_POSITION_LAST_TRY_VAR + 30, 425, 20, 20);
                if (result.get(1) == 2) {
                    RESULT_2.setBackground(Color.BLACK);
                } else if (result.get(1) == 1) {
                    RESULT_2.setBackground(Color.WHITE);
                } else {
                    RESULT_2.setVisible(false);
                }
                JButton RESULT_3 = new JButton("");
                RESULT_3.setBounds(X_POSITION_LAST_TRY_VAR, 455, 20, 20);
                if (result.get(2) == 2) {
                    RESULT_3.setBackground(Color.BLACK);
                } else if (result.get(2) == 1) {
                    RESULT_3.setBackground(Color.WHITE);
                } else {
                    RESULT_3.setVisible(false);
                }
                JButton RESULT_4 = new JButton("");
                RESULT_4.setBounds(X_POSITION_LAST_TRY_VAR + 30, 455, 20, 20);
                if (result.get(3) == 2) {
                    RESULT_4.setBackground(Color.BLACK);
                } else if (result.get(3) == 1) {
                    RESULT_4.setBackground(Color.WHITE);
                } else {
                    RESULT_4.setVisible(false);
                }


                contentPane.add(LAST_TRY_1);
                contentPane.add(LAST_TRY_2);
                contentPane.add(LAST_TRY_3);
                contentPane.add(LAST_TRY_4);
                contentPane.add(RESULT_1);
                contentPane.add(RESULT_2);
                contentPane.add(RESULT_3);
                contentPane.add(RESULT_4);
                contentPane.repaint();

                X_POSITION_LAST_TRY_VAR += 70;


                if (COURENT_ROUND > NOUMBER_OF_ROUNDS) {

                    X_POSITION_LAST_TRY_VAR = 140;
                    COURENT_ROUND = 0;

                    contentPane.removeAll();
                    contentPane.add(START_BTN);
                    START_BTN.setVisible(true);
                    contentPane.add(NOUMBER_OF_COLORS_BTN);
                    NOUMBER_OF_COLORS_BTN.setVisible(true);
                    contentPane.add(NOUMBER_OF_ROUNDS_BTN);
                    NOUMBER_OF_ROUNDS_BTN.setVisible(true);
                    GUESS_OK_BTN.setText("OK");
                    contentPane.repaint();
                    WIN = false;


                }
                if (COURENT_ROUND == NOUMBER_OF_ROUNDS || WIN) {

                    CODE_COLOR_1_BTN.setVisible(true);
                    CODE_COLOR_1_BTN.setEnabled(false);
                    CODE_COLOR_2_BTN.setVisible(true);
                    CODE_COLOR_2_BTN.setEnabled(false);
                    CODE_COLOR_3_BTN.setVisible(true);
                    CODE_COLOR_3_BTN.setEnabled(false);
                    CODE_COLOR_4_BTN.setVisible(true);
                    CODE_COLOR_4_BTN.setEnabled(false);
                    GUESS_OK_BTN.setText("RESTART");
                    COURENT_ROUND = NOUMBER_OF_ROUNDS;

                }

            }
        });

    }

    ;
}

//            @Override
//            public void actionPerformed(ActionEvent e) {
//                contentPane.add(CODE_OK_BTN);
//                contentPane.add(AI_BTN);
//                contentPane.add(CODE_COLOR_1_BTN);
//                contentPane.add(CODE_COLOR_2_BTN);
//                contentPane.add(CODE_COLOR_3_BTN);
//                contentPane.add(CODE_COLOR_4_BTN);
//
//}
