package done.list_1;


class Node {
    public int age;
    public String first_name;
    public String last_name;

    public Node next;

    @Override
    public String toString() {
        return "Node{" +
                "age=" + age +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", next=" + next +
                '}';
    }
}