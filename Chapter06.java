
int a = 15;
int c;
c = a + 3;  // c = 18
c = a - 5;  // c = 10
c = a * 2;  // c = 20
c = a / 6;  // c = 2
c = a % 4;  // c = 3


String a = "applePie";
String b = "applePie";
c = a == b;  // c = true

String a = "applePie";
String d = "apple";
String e = d + "Pie";
c = a == e;  // c = false

String a = "applePie";
String f = new String("applePie");
c = a == f;  // c = false

// 変数の中身はすぐ上の例と同じ
c = a.equals(b);  // c = true
c = a.equals(e);  // c = true
c = a.equals(f);  // c = true
