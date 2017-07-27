#include<Windows.h>
#include<GL/glut.h>
#include<GL/GL.h>
#include<math.h>
void display()
{
	glClear(GL_COLOR_BUFFER_BIT);
	glBegin(GL_POLYGON);
	glColor3f(1.0,1.0,0.0);
	glVertex2f(0.2,0.1);
	glVertex2f(0.2,0.3);
    glVertex2f(0.4,0.3);
    glVertex2f(0.4,0.5);
    glVertex2f(0.6,0.5);
    glVertex2f(0.6,0.3);
    glVertex2f(0.8,0.3);
    glVertex2f(0.8,0.1);
	glEnd();
	glBegin(GL_POLYGON);
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0,0.0,0.0);
	float x,y,r=0.05,i;
	for(i=0;i<360;i++)
	{
		x=r*cos(i);
		y=r*sin(i);
		glVertex2f(x+0.3,y+0.1);
	}
	glEnd();
	glBegin(GL_POLYGON);
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0,0.0,0.0);
	for(i=0;i<360;i++)
    {
		x=r*cos(i);
		y=r*sin(i);
		glVertex2f(x+0.7,y+0.1);
	}
	glEnd();
	glFlush();
}
void main(int argc,char**argv)
{
	glutInit(&argc,argv);
	glutInitWindowSize(500,500);
	glutInitWindowPosition(300,300);
	glutCreateWindow("SIMPLE");
	glutDisplayFunc(display);
	glutMainLoop();
}




