public class Items implements Container {
    public String items[] = {"Emas", "Uang", "Berlian", "Hard Disk"};
    
    @Override
    public Iterator getIterator() {
        return new ItemsIterate();
    }

    private class ItemsIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < items.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return items[i++];
            }
            return null;
        }
    }
}