import java.util.Scanner;

public class tmp {
    public static void main(String[] args) {
        String Name[] = new String[100005];
        int Age[] = new int[100005];
        int n = 0;
        boolean f = false;
        Scanner In = new Scanner(System.in);
        System.out.println("已启动");
        String str;
        while (true) {
            str = In.next();
            System.out.println(n);
            System.out.println(str == "insert");
            // return ;
            if (str.equals("insert")) {
                Name[n] = In.next();
                Age[n] = In.nextInt();
                f = false;
                for (int i = 0; i < n; ++i)
                    if (Name[i].equals(Name[n]) && Age[i] == Age[n]) {
                        f = true;
                        break;
                    }
                if (f) {
                    System.out.println("该员工已存在");
                } else {
                    ++n;
                    System.out.println("成功加入");
                }
            } else if (str.equals("erase")) {
                Name[n] = In.next();
                Age[n] = In.nextInt();
                f = false;
                for (int i = 0; i < n; ++i)
                    if (Name[i].equals(Name[n]) && Age[i] == Age[n]) {
                        --n;
                        Name[i] = Name[n];
                        Age[i] = Age[n];
                        f = true;
                        break;
                    }
                System.out.println(f ? "成功删除" : "该员工不存在");
            } else if (str.equals("print")) {
                for (int i = 0; i < n; ++i)
                    System.out.println(Name[i] + " " + Age[i]);
            } else if (str.equals("exit"))
                break;
            else
                System.out.println("指令不合法");
        }
        System.out.println("已关闭");
        In.close();

        return;
    }
}
