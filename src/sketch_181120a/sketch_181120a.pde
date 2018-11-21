void setup(){
size(1000,1000);  
}
void draw(){
noFill();
for(int i=1; i<101;i++){
  if(i%2==0){
fill(255,0,0);
  }
    ellipse(500,500,10*i,10*i);
    
}
}