int xPosition=75;
int yPosition=75;
int diameter=50;

int ellipsex = 200;
int ellipsey = 75;
int diameter = 50;

int circlex = 200;
int circley = 185;
int diameter = 50;

int xposition = 75;
int circley = 185;
int diameter = 50;
void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

  background(255);
  stroke(0);
  fill(175);

ellipse(xPosition,yPosition, diameter, diameter)
  
ellipse(ellipsex, ellipsey, diameter ,diameter)
 
 ellipse(circlex, circley, diameter , diameter)

 ellipse(xposition, circley, diameter, diameter)
}