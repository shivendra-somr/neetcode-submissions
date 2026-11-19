class MedianFinder {

    private List<Integer> numList;
    public MedianFinder() {
        this.numList = new ArrayList<>();
    }
    
    public void addNum(int num) {
        this.numList.add(num);
    }
    
    public double findMedian() {
        int n = numList.size();
        Collections.sort(numList);
        if(n % 2 == 0){
            int l = n/2, r = l + 1;
            double median = (double) (numList.get(l-1) + numList.get(r-1)) / 2;
            return median;
        }
        else{
            return (double) numList.get(n/2);
        }
    }
}
