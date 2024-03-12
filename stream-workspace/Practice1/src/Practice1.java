
import java.util.*;

class Practice1 {
    static int N, M;
    static char[][] board;
    static boolean[][][][] visited;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1, 0};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1, 0};
    static int startAx, startAy, startBx, startBy;

    public static boolean isWall(int x, int y) {
        return x < 0 || y < 0 || x >= M || y >= N || board[y][x] == 'X';
    }

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {startAx, startAy, startBx, startBy, 0});
        visited[startAy][startAx][startBy][startBx] = true;

        while (!q.isEmpty()) {
            int[] front = q.poll();
            int ax = front[0], ay = front[1], bx = front[2], by = front[3], c = front[4];

            if (ax == startBx && ay == startBy && bx == startAx && by == startAy) {
                System.out.println(c);
                return;
            }

            for (int i = 0; i < 9; i++) {
                int nax = ax + dx[i];
                int nay = ay + dy[i];
                if (isWall(nax, nay))
                    continue;

                for (int j = 0; j < 9; j++) {
                    int nbx = bx + dx[j];
                    int nby = by + dy[j];
                    if (isWall(nbx, nby))
                        continue;

                    if (visited[nay][nax][nby][nbx])
                        continue;

                    if (nax == nbx && nay == nby)
                        continue;

                    if (nax == bx && nay == by && nbx == ax && nby == ay)
                        continue;

                    q.add(new int[] {nax, nay, nbx, nby, c + 1});
                    visited[nay][nax][nby][nbx] = true;
                }
            }
        }

        System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new char[N][M];
        visited = new boolean[N][M][N][M];

        for (int y = 0; y < N; y++) {
            String row = sc.next();
            for (int x = 0; x < M; x++) {
                board[y][x] = row.charAt(x);
                if (board[y][x] == 'A') {
                    startAx = x;
                    startAy = y;
                } else if (board[y][x] == 'B') {
                    startBx = x;
                    startBy = y;
                }
            }
        }

        bfs();
        sc.close();
    }
 
}