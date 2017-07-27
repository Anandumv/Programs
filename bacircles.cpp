#include<Windows.h>
#include<GL/glut.h>
#include<stdio.h>
#include<math.h>
#include<GL/gl.h>


void init(void)
{
  glClearColor(1.0,1.0,1.0,1.0);
  glMatrixMode(GL_POINTS);
  gluOrtho2D(-700.0,700.0,-600.0,600.0);
}

void setPixel(GLint x,GLint y)
{
  glBegin(GL_POINTS);
     glVertex2i(x,y);
	  glVertex2i(y,x);
	  glVertex2i(-x,y);
	   glVertex2i(y,-x);
	   glVertex2i(-x,-y);
	    glVertex2i(-y,-x);
	    glVertex2i(x,-y);
		 glVertex2i(-y,x);
  glEnd();
}

void line()
{
	int r;
	printf("enter radius");
	scanf("%d",&r);
  int x0 = 0, y0=r,DI=2*(1-r),lmt=0;
  int	d1, d2;	//deltas		//looping variable

  glClear(GL_COLOR_BUFFER_BIT);
  glColor3f( 1.0 ,0.0, 0.0);  
  	//plot first point
  
  // difference between starting and ending points
  while(y0>=lmt)
  {
	  setPixel(x0, y0);
	  if(DI<0)
	  {
		  d1=2*DI+2*y0-1;
		  if(d1<=0)
			 {
	x0=x0+1;
	DI=DI+2*x0+1;
} 
		  else
			  {
	x0=x0+1;
	y0=y0-1;
	DI=DI+2*x0-2*y0+2;
}
	  }
	  else
		  if(DI>0)
		  {
			  d2=2*DI-2*x0-1;
			  if(d2<=0)
				 {
	x0=x0+1;
	y0=y0-1;
	DI=DI+2*x0-2*y0+2;
} 
			  else
				  {
	y0=y0-1;
	DI=DI-2*y0+1;
}
		  }
		  else
			  if(DI=0)
				  {
	x0=x0+1;
	y0=y0-1;
	DI=DI+2*x0-2*y0+2;
} 
  }

  glFlush();
}

int main(int argc,char **argv){
    glutInit(&argc,argv);
    glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
    glutInitWindowPosition(0,0);
    glutInitWindowSize(500,500);
    glutCreateWindow("Bresenham Line");
    init();
    glutDisplayFunc( line );
    glutMainLoop();
    return 0;
}