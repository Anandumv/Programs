#include <stdio.h>
#include <math.h>
#include <GL/glut.h>

double X1, Y1, X2, Y2;


void Linebre(void)
{
 double dx=(X2-X1);
 double dy=(Y2-Y1);
 double e,x=X1,y=Y1;
 e=2*dy-dx;
 glClear(GL_COLOR_BUFFER_BIT);
 glBegin(GL_POINTS);
 glVertex2d(x,y);
 int k;
 for(k=0;k<dx;k++)
 {
  glVertex2d(x,y);
while (e>0)
{
y=y+1;
e=e-2*dx;
}
x=x+1;
e=e+2*dy;
   
 }
 glEnd();

 glFlush();
}

void main(int argc, char **argv)
{
 printf("Enter points of line\n");
 printf("\nP1( X1 , Y1):\n");
 scanf("%lf%lf",&X1,&Y1);
 printf("\n P2( X2 , Y2):\n");
 scanf("%lf%lf",&X2,&Y2);
 glutInit(&argc,argv);
 glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
 glutInitWindowPosition(100,100);
 glutInitWindowSize(500,500);
 glutCreateWindow("Bresenham Line");
 glClearColor(0.0,1.0,1.0,0);
 glColor3f(1.0,1.0,0.0);
 gluOrtho2D(0 , 500 , 0 , 500);
 glutDisplayFunc(Linebre);
 glutMainLoop();
}