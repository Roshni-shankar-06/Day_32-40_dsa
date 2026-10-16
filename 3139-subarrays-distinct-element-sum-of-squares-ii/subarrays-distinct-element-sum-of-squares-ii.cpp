class LazySegmentTree {
 public:
  LazySegmentTree(int n, int kMod)
      : n(n), kMod(kMod), lazy(4 * n), sums(4 * n), squaredSums(4 * n) {}

