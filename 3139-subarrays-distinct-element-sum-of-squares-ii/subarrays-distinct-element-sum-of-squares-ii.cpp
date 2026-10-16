class LazySegmentTree {
 public:
  LazySegmentTree(int n, int kMod)
      : n(n), kMod(kMod), lazy(4 * n), sums(4 * n), squaredSums(4 * n) {}

  void updateRange(int l, int r) {
    return updateRange(/*i=*/0, /*start=*/0, /*end=*/n - 1, l, r);
  }

  void propagate(int i, int l, int r) {
    const int gap = r - l + 1;
    // (a + L)^2 + (b + L)^2 + (c + L)^2, where L = lazy[i]
    // a^2 + b^2 + c^2 + 2 * L (a + b + c) + L^2 * gap, where gap = 3
    squaredSums[i] += 2 * lazy[i] * sums[i] + lazy[i] * lazy[i] * gap;
    squaredSums[i] %= kMod;
    sums[i] += lazy[i] * gap;
    sums[i] %= kMod;
    if (l < r) {
      lazy[i * 2 + 1] += lazy[i];
      lazy[i * 2 + 2] += lazy[i];
  

