void setup() {
size(550,850);
}
void draw() {
if (mousePressed) {
  background(255,87,51);
  stroke(51,206,255);
  fill(51,206,255);
  rect(150,300,250,300);
}
else {
  background(51,206,255);
  stroke(255,87,51);
  fill(255,87,51);
  ellipse(275,425,300,300);
}
 }
