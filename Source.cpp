#include<Windows.h>
#include<GL/glut.h>
#include<GL/gl.h> 

void display()
{
	glClearColor(1.0,1.0,1.0,0.0);
	glClear(GL_COLOR_BUFFER_BIT);
	glBegin(GL_POLYGON);
	glColor3f(1.0,0.0,0.0);
	glVertex2f(0.25,0.25);// line coordinates x1,y1
	glVertex2f(0.25,1.0);//line coordinates x2,y2
	glVertex2f(0.75,0.25);
	
	glEnd();
	glFlush();
}

void main(int argc, char** argv) 
{
    glutInit(&argc,argv);
    glutInitDisplayMode(GLUT_RGB|GLUT_SINGLE); 
    glutInitWindowSize(500,500); 
	glutInitWindowPosition(5,5);
    glutCreateWindow("SIMPLE"); 
    //init(); 
    glutDisplayFunc(display); 
    //glutReshapeFunc(resize); 
    //glutKeyboardFunc(key); 
    glutMainLoop(); 
}