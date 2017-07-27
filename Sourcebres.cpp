#include <stdio.h>
#include <math.h>
#include <GL/glut.h>

double X1, Y1, X2, Y2;


void Linebre(void)
{
 double dx=(X2-X1);
 double dy=(Y2-Y1);
 double m,e,x=X1,y=Y1;
 m=(dy/dx);
 e=(m-(1/2));
 glClear(GL_COLOR_BUFFER_BIT);
 glBegin(GL_POINTS);
 glVertex2d(x,y);
 int k;
 for(k=0;k<dx;k++)
 {
  glVertex2d(floor(x+0.5), floor(y+0.5));
while (e>0)
{
y=y+1;
e=e-1;
}
x=x+1;
e=e+m;
   
 }
 glEnd();

 glFlush();
}

void main(int argc, char **argv)
{
 printf("Enter two  points \n");
 printf("\nEnter P1( X1 , Y1):\n");
 scanf("%lf%lf",&X1,&Y1);
 printf("\nEnter P2( X2 , Y2):\n");
 scanf("%lf%lf",&X2,&Y2);
 glutInit(&argc,argv);
 glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
 glutInitWindowPosition(100,100);
 glutInitWindowSize(400,400);
 glutCreateWindow("Bresenham");
 glClearColor(0.0,1.0,1.0,0);
 glColor3f(1.0,0.0,1.0);
 gluOrtho2D(0 , 400 , 0 , 400);
 glutDisplayFunc(Linebre);
 glutMainLoop();
}