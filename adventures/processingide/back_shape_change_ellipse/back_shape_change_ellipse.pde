void setup() {
fullScreen(P2D,1);
}
void draw() {
  if (mousePressed) {
  background(255,87,51);
  stroke(51, 255, 82);
  fill(51, 255, 82);
  ellipse(500,500,300,300);
  } 
  else { 
    background(51, 255, 82);
    stroke(255,87,51);
    fill(255,87,51);
    ellipse(500,500,300,300);
  } 
    }