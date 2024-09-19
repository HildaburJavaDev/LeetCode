// task №284

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> it;
    private Integer num;

	public PeekingIterator(Iterator<Integer> iterator) {
	    it = iterator;
        num = null; 
	}
	
	public Integer peek() {
        if (num == null) {
            num = it.next();
        }
        return num;
	}
	@Override
    public Integer next() {
        if (num == null) {
            return it.next();
        }
        Integer ans = num;
        num = null;
        return ans;
    }
    
    @Override
    public boolean hasNext() {
        return num != null || it.hasNext();
    }
}
