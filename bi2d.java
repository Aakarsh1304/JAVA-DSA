import java.util.Arrays;

public class bi2d {

    public static void main(String[] args) {
        int[][] matrix={
          {1,2,3},
          {4,5,6},
          {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix, 12)));
    }
    static int[] binaryS(int[][] matrix,int row,int cSt,int End,int target){
while (cSt<=End) {
    int mid=cSt +(End-cSt)/2;
    if(matrix[row][mid]==target){
        return new int[]{row,mid};
    }
    if(matrix[row][mid]<target){
        cSt=mid+1;
    }
    else{
        End=mid-1;
    }
}
return new int[] {-1,-1}; 


    }
    static int[] search(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==1){
            return binaryS(matrix, 0, 0, col-1, target);
        }
         
        int Rs=0;
        int Re=row-1;
        int cMid=col/2;
while (Rs<(Re-1)) {
    int mid=Rs+(Re-Rs)/2;
     if(matrix[mid][cMid]==target){
        return new int[]{mid,cMid};
     }
     if(matrix[mid][cMid]<target){
    Rs=mid;
     }
     else{
        Re=mid;
     }
}
if(matrix[Rs][cMid]==target){
    return new int[]{Rs,cMid};

}
if(matrix[Rs+1][cMid]==target){
    return new int[]{Rs+1,cMid};

}
if(matrix[Rs][cMid+1]<=target && target<=matrix[row][col-1]){
    return binaryS(matrix, Rs, cMid+1, col-1, target);

}if(matrix[Rs][cMid-1]>=target){
    return binaryS(matrix, Rs, 0, cMid-1, target);

}if(matrix[Rs+1][cMid-1]>=target){
    return binaryS(matrix, Rs+1, 0, cMid-1, target);

}
else{ 
     return  binaryS(matrix, Rs+1,cMid+1, col-1, target);
}



        
        

    }
}