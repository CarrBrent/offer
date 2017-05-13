package offer;

/**
 * Created by jiashilin on 2017/5/13.
 */
public class a01_Find {
    //并不是按照正常的编码思路从左上角向右下角依次去查找，而是从右上角去考虑，这样可以大大简化编码难度

    public boolean Find(int target, int [][] array) {

        if(array.length>0 && array[0].length>0){
            //获得array的列数
            int j = array[0].length-1;
            int i = 0;
            return Judge(target,array,i,j);
        }else{
            return false;

        }

    }

    public boolean Judge(int target, int [][] array,int i,int j) {

        if(array[i][j]>target){
            j = j-1;
            if(j<0){
                return false;
            }else{
                return Judge(target,array,i,j);
            }
        }
        else if(array[i][j]<target){
            i = i+1;
            if (i== array.length){
                return false;
            }else{
                return Judge(target,array,i,j);
            }
        }else{
            return true;
        }

    }

}