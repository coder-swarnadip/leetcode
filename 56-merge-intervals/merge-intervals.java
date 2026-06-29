class Solution {

   
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);

        List<List<Integer>> res= new ArrayList<>();

        int n = intervals.length;
        // int m = intervals[0].length;
        // for(int i=1;i<n;i++){

        //     if(intervals[i][0]<=intervals[i-1][1]){

        //         int min =Math.min(intervals[i-1][0], intervals[i][0]);
        //         int max= Math.max(intervals[i-1][1], intervals[i][1]);

        //         res.add(Arrays.asList(min,max));
                
        //     }else{
        //                     res.add(Arrays.asList(intervals[i][0],intervals[i][1]));

        //     }

        // }



        int st= intervals[0][0];
        int en= intervals[0][1];


        for( int i =0; i<n; i++){
            if(intervals[i][0]<=en){
                en=Math.max(intervals[i][1],en);

            }else{
                res.add(Arrays.asList(st,en));

                st= intervals[i][0];
                en= intervals[i][1];            }
        }

        res.add(Arrays.asList(st,en));

         int[][] arr = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {
            arr[i][0] = res.get(i).get(0);
            arr[i][1] = res.get(i).get(1);
        }
return arr;



    }
}