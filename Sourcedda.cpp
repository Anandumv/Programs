#include <stdio.h>
#include <math.h>
#include <GL/glut.h>
#include <GL/gl.h>
#include <conio.h>

double X1=100, Y1=150, X2=150, Y2=250;


void LineDDA(void)
{
  double dx=(X2-X1);
  double dy=(Y2-Y1);
  double steps;
  float dX,dY,x=X1,y=Y1;
  if(abs(dx)>abs(dy))
	  steps=abs(dx);
  else
      steps=abs(dy);
  dX=dx/(float)steps;
  dY=dy/(float)steps;
  glClear(GL_COLOR_BUFFER_BIT);
  glBegin(GL_POINTS);
  glVertex2d(x,y);
  int k;
  for(k=0;k<steps;k++)
  {
    x+=dX;
    y+=dY;
    glVertex2d(floor(x+0.5), floor(y+0.5));
  }
  glEnd();

  glFlush();
}

void main(int argc, char **argv)
{
  printf("Enter two end points of the line to be drawn:\n");
  printf("\nEnter Point1( X1 , Y1):\n");
  scanf("%lf%lf",&X1,&Y1);
  printf("\nEnter Point1( X2 , Y2):\n");
  scanf("%lf%lf",&X2,&Y2);
  glutInit(&argc,argv);
  glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
  glutInitWindowPosition(100,100);
  glutInitWindowSize(300,300);
  glutCreateWindow("DDA_Line");
  glClearColor(1.0,1.0,1.0,0);
  glColor3f(1.0,0.0,0.0);
  gluOrtho2D(0 , 300 , 0 , 300);
  glutDisplayFunc(LineDDA);
  glutMainLoop();
}

