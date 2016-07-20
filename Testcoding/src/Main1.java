import java.util.Scanner;

/**
 * @author chauhan.manish
 * @FileName Solution.java
 * @Time 9:31:01 PM
 */
public class Main1 {
	 public static void main(String[] args) {
		 long matrix[][]	=	new long[501][501];
		  long temp[][][]	=	new	long[2][501][501];
		 int m, n;
		 Scanner 	sc	=	new	Scanner(System.in);
		 m	=	sc.nextInt();
		 n	=	sc.nextInt();
		    for (int i = 0; i < m; ++i)
		        for (int j = 0; j < n; ++j)
		        	matrix[i][j]=sc.nextInt();

		     long total, out1, out2;
		    Boolean flag;
		    for (int j = n - 1; j >= 0; --j) {
		        for (int i = 0; i < m; ++i) {
		            total = 0;
		            if (matrix[i][j] == -1) {

		                temp[0][i][j] = temp[1][i][j] = -1;
		                continue;
		            }
		            out1 = -1;
		            out2 = -1;
		            flag = false;

		            for (int k = i; k >= 0; --k) {
		                if (matrix[k][j] == -1) {
		                    flag = true;
		                    break;
		                }
		                total += matrix[k][j];

		                if (temp[0][k][j + 1] != -1 && temp[0][k][j + 1] + total > out1)
		                    out1 = temp[0][k][j + 1] + total;

		                if (temp[1][k][j + 1] != -1 && temp[1][k][j + 1] > out2)
		                    out2 = temp[1][k][j + 1];
		            }
		            if (!flag) {
		                total = 0;
		                for (int k = m - 1; k > i; --k) {
		                    if (matrix[k][j] == -1) {
		                        flag = true;
		                        break;
		                    }
		                    total += matrix[k][j];

		                    if (temp[0][k][j + 1] != -1 && temp[0][k][j + 1] + total > out2)
		                        out2 = temp[0][k][j + 1] + total;
		                    if (temp[1][k][j + 1] != -1 && temp[1][k][j + 1] > out2)
		                        out2 = temp[1][k][j + 1];
		                }
		            }


		            total = 0;
		            flag = false;
		            for (int k = i; k < m; ++k) {
		                if (matrix[k][j] == -1) {
		                    flag = true;
		                    break;
		                }
		                total += matrix[k][j];
		                if (temp[0][k][j + 1] != -1 && temp[0][k][j + 1] + total > out1)
		                    out1 = temp[0][k][j + 1] + total;
		                if (temp[1][k][j + 1] != -1 && temp[1][k][j + 1] > out2)
		                    out2 = temp[1][k][j + 1];
		            }
		            if (!flag) {
		                total = 0;
		                for (int k = 0; k < i; ++k) {
		                    if (matrix[k][j] == -1) {
		                        flag = true;
		                        break;
		                    }
		                    total += matrix[k][j];
		                    if (temp[0][k][j + 1] != -1 && temp[0][k][j + 1] + total > out2)
		                        out2 = temp[0][k][j + 1] + total;
		                    if (temp[1][k][j + 1] != -1 && temp[1][k][j + 1] > out2)
		                        out2 = temp[1][k][j + 1];
		                }
		            }

		            temp[0][i][j] = out1;
		            temp[1][i][j] = out2;
		        }
		    }


		    long ans = -1;
		    for (int i = 0; i < m; ++i) {
		        if (temp[0][i][0] > ans)
		            ans = temp[0][i][0];
		        if (temp[1][i][0] > ans)
		            ans = temp[1][i][0];
		    }

		    System.out.println(ans);
		}
	
}
