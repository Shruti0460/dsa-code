//Tuple with Same Product

class tupleproduct {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productMap = new HashMap<>();
        int count = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            for(int j = i + 1; j<n; j++)
            {
                int product = nums[i] * nums[j];
                productMap.put(product, productMap.getOrDefault(product, 0)+1);

            }
        }
        for(int freq : productMap.values())
        {
            if(freq > 1)
            {
                count += (freq * (freq - 1) / 2) * 8;
            }
        }
        return count;
    }
}
