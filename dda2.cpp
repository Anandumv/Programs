#include<Windows.h>
#include<gl/GL.h>
#include<gl/glut.h>
#include<stdio.h>
void myInit(void)
{
	glClearColor(1.0,0.0,0.0,0.0);
	glColor3f(0.0,0.0,0.0);
	glPointSize(4.0);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(0.0,640.0,0.0,480.0);
}
void myDisp(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	glBegin(GL_POINTS);
	int xa,ya,xb,yb,l;
	printf("Enter the coordinates of first point\n");
	scanf("%d%d",&xa,&ya);
	printf("Enter the coordinates of second point\n");
	scanf("%d%d",&xb,&yb);
	float x=xa+0.5,y=ya+0.5,dx,dy;
	if(abs(xb-xa)>=abs(yb-ya))
		l=abs(xb-xa);
	else
		l=abs(yb-ya);
	dy=(yb-ya)/l;
	dx=(xb-xa)/l;
	for(int i=1;i<l;i++)
	{
		glVertex2i(x,y);
		x=x+dx;
		y=y+dy;
	}
	glEnd();
	glFlush();
}
void main(int argc, char**argv)
{
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	glutInitWindowSize(640,480);
	glutInitWindowPosition(100,150);
	glutCreateWindow("Digital Differential Analyzer");
	glutDisplayFunc(myDisp);
	myInit();
	glutMainLoop();
}	