#include<Windows.h>
#include<gl/GL.h>
#include<gl/glut.h>
#include<stdio.h>
void myInit(void)
{
	glClearColor(0.0,0.0,1.0,1.0);
	glColor3f(0.0,0.0,0.0);
	glPointSize(4.0);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(-100.0,100.0,-100.0,100.0,-1.0,0.0);
}
void Circle(int r)
{
	glBegin(GL_POINTS);
	int x,y,di,limit=0,d,d1;
	di=2*(1-r);
	x=0;
	y=r;
step1:

	glVertex2i(x,y);
	glVertex2i(x,-y);
	glVertex2i(-x,y);
	glVertex2i(-x,-y);
	if(y<=limit)
		goto step20;
	else if (di<0)
		goto step5;
	else if (di>0)
		goto step10;
	else if (di=0)
		goto step12;
step5:
	d=2*di+2*y-1;
	if(d<=0)
		goto step11;
	else
		goto step13;
step10:
	d1=2*di-2*x-1;
	if(d1<=0)
		goto step12;
	else
		goto step13;
step11:
	x=x+1;
	y=y;
	di=di+2*x+1;
	goto step1;
step12:
	x=x+1;
	y=y-1;
	di=di+2*x-2*y+2;
	goto step1;
step13:
	x=x;
	y=y-1;
	di=di-2*y+1;
	goto step1;
step20:
	glEnd();
}
void myDisp(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	int r;
	printf("Enter the radius of the circle\n");
	scanf("%d",&r);
	Circle(r);
	glFlush();
}
void main(int argc, char**argv)
{
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	glutInitWindowSize(640,480);
	glutInitWindowPosition(50,150);
	glutCreateWindow(" Circle");
	glutDisplayFunc(myDisp);
	myInit();
	glutMainLoop();
}