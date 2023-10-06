import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {

    private List<Integer> heap;
    private int numChildren;

    public PowerOfTwoMaxHeap(int numChildren) {
        if (numChildren <= 0) {
            throw new IllegalArgumentException("Number of children must be greater than zero.");
        }
        this.heap = new ArrayList<>();
        this.numChildren = numChildren;
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }

        int max = heap.get(0);
        int lastElement = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            heapifyDown(0);
        }

        return max;
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / numChildren;

        while (index > 0 && heap.get(index) > heap.get(parent)) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / numChildren;
        }
    }

    private void heapifyDown(int index) {
        int maxChildIndex = getMaxChildIndex(index);

        while (maxChildIndex != -1 && heap.get(index) < heap.get(maxChildIndex)) {
            swap(index, maxChildIndex);
            index = maxChildIndex;
            maxChildIndex = getMaxChildIndex(index);
        }
    }

    private int getMaxChildIndex(int index) {
        int startChildIndex = index * numChildren + 1;
        int endChildIndex = Math.min(startChildIndex + numChildren, heap.size());
        if (startChildIndex >= heap.size()) {
            return -1;
        }

        int maxChildIndex = startChildIndex;
        for (int i = startChildIndex + 1; i < endChildIndex; i++) {
            if (heap.get(i) > heap.get(maxChildIndex)) {
                maxChildIndex = i;
            }
        }
        return maxChildIndex;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        // Example usage:
        PowerOfTwoMaxHeap maxHeap = new PowerOfTwoMaxHeap(2);
        maxHeap.insert(5);
        maxHeap.insert(10);
        maxHeap.insert(7);
        System.out.println(maxHeap.popMax()); // Output: 10
        System.out.println(maxHeap.popMax()); // Output: 7
        System.out.println(maxHeap.popMax()); // Output: 5
    }
}
