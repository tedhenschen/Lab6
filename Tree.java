class Tree{
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree(){
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName,String aTreeType,boolean aLeavesFall, String aLeafColor ){
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  void setTreeName(String aTreeName){
    treeName = aTreeName;
  }

  void setTreeType(String aTreeType){
    treeType = aTreeType;
  }

  void setleavesFall(boolean aLeavesFall){
    leavesFall = aLeavesFall;
  }

  void setLeafColor(String aLeafColor){
    leafColor = aLeafColor;
  }

  String getTreeName(){
    return treeName;
  }

  String getTreeType(){
    return treeType;
  }

  boolean getLeafLoss(){
    return leavesFall;
  }

  String getLeafColor(){
    return leafColor;
  }

  void print(){
    if (leavesFall){
        System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does lose its leaves for the winter" );
    }
    else{
        System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does not lose its leaves for the winter" );
    }
  }

}