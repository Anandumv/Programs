#include<Windows.h>
#include<GL/glut.h>
#include<GL/gl.h> 

void display()
{
	//glClearColor(1.0,1.0,1.0,0.0);
	glClear(GL_COLOR_BUFFER_BIT);
	glBegin(GL_LINES);
	glColor3f(1.0,1.0,0.0);
	glVertex2f(0.5,0.75);// line coordinates x1,y1
	glVertex2f(0.75,0.5);//line coordinates x2,y2
	glEnd();
	glFlush();
}

void main(int argc, char** argv) 
{
    glutInit(&argc,argv);
    //glutInitDisplayMode(GLUT_RGB|GLUT_SINGLE); 
    glutInitWindowSize(400,400); 
	glutInitWindowPosition(50,50);
    glutCreateWindow("SIMPLE"); 
    //init(); 
    glutDisplayFunc(display); 
    //glutReshapeFunc(resize); 
    //glutKeyboardFunc(key); 
    glutMainLoop(); 
}
