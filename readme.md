# Java 算法练习

欢迎来到我的个人算法练习仓库。本仓库包含各种算法题目的练习及其 Java 实现，并按不同的算法和数据结构分类组织。

# 一、目录

1. [数组](#二数组)
2. [链表](#链表)
3. [树](#树)
4. [图](#图)
5. [排序](#排序)
6. [搜索](#搜索)
7. [动态规划](#动态规划)
8. [递归](#递归)
9. [位操作](#位操作)
10. [数学](#数学)
11. [字符串](#字符串)
12. [回溯](#回溯)
13. [贪心算法](#贪心算法)
14. [哈希表](#哈希表)
15. [堆](#堆)
16. [队列](#队列)
17. [栈](#栈)

# 二、数组

本目录包含与数组算法相关的练习题目。数组是计算机科学中最基本的数据结构之一。

## 2.1 题目

### 2.1.1 两数之和

- leetCode 地址： https://leetcode.cn/problems/two-sum/
- 题目描述： 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。

- 解题：  [两数之和](src/arrays/TowSum.java)
- 核心思路： 通过哈希表来解决

### 2.1.2 三数之和

- LeetCode 地址： https://leetcode.cn/problems/3sum/
- 题目描述： 给你一个整数数组 `nums` ，判断是否存在三元组 `[nums[i], nums[j], nums[k]]` 满足 `i != j`、`i != k` 且 `j != k`
  ，同时还满足 `nums[i] + nums[j] + nums[k] == 0` 。
- 解题： [三数之和](src/arrays/ThreeSum.java)
- 核心思路
    - 暴力解法
    - 哈希
    - 夹逼

## 2.2 常见算法

- 双指针技巧
- 滑动窗口
- 数组中的二分查找
- 排序算法
- ...

## 2.3 参考资料

- [数组数据结构](https://zh.wikipedia.org/wiki/数组)
- [LeetCode 数组题目](https://leetcode-cn.com/tag/array/)

## 链表

本目录包含与链表算法相关的练习题目。链表是理解动态数据结构的基础。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 单链表操作
- 双链表操作
- 环检测
- ...

### 参考资料

- [链表数据结构](https://zh.wikipedia.org/wiki/链表)
- [LeetCode 链表题目](https://leetcode-cn.com/tag/linked-list/)

## 树

本目录包含与树算法相关的练习题目。树是计算机科学中广泛使用的层次结构数据结构。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 二叉树遍历
- 二叉搜索树
- AVL 树
- ...

### 参考资料

- [树数据结构](https://zh.wikipedia.org/wiki/树_(数据结构))
- [LeetCode 树题目](https://leetcode-cn.com/tag/tree/)

## 图

本目录包含与图算法相关的练习题目。图用于建模对象之间的关系。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 深度优先搜索 (DFS)
- 广度优先搜索 (BFS)
- Dijkstra 算法
- ...

### 参考资料

- [图论](https://zh.wikipedia.org/wiki/图论)
- [LeetCode 图题目](https://leetcode-cn.com/tag/graph/)

## 排序

本目录包含与排序算法相关的练习题目。排序是许多应用程序中最基本的操作。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 快速排序
- 归并排序
- 堆排序
- ...

### 参考资料

- [排序算法](https://zh.wikipedia.org/wiki/排序算法)
- [LeetCode 排序题目](https://leetcode-cn.com/tag/sorting/)

## 搜索

本目录包含与搜索算法相关的练习题目。搜索用于从数据结构中检索信息。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 二分查找
- 线性查找
- 指数查找
- ...

### 参考资料

- [搜索算法](https://zh.wikipedia.org/wiki/搜索算法)
- [LeetCode 搜索题目](https://leetcode-cn.com/tag/searching/)

## 动态规划

本目录包含与动态规划相关的练习题目。动态规划是一种通过将问题分解为子问题来解决问题的技术。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 斐波那契数列
- 最长公共子序列
- 背包问题
- ...

### 参考资料

- [动态规划](https://zh.wikipedia.org/wiki/动态规划)
- [LeetCode 动态规划题目](https://leetcode-cn.com/tag/dynamic-programming/)

## 递归

本目录包含与递归相关的练习题目。递归是一种通过函数调用自身来解决问题的方法。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 阶乘计算
- 汉诺塔
- 递归树遍历
- ...

### 参考资料

- [递归 (计算机科学)](https://zh.wikipedia.org/wiki/递归_(计算机科学))
- [LeetCode 递归题目](https://leetcode-cn.com/tag/recursion/)

## 位操作

本目录包含与位操作相关的练习题目。位操作涉及直接操作位，并用于各种算法中。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 位与、位或、位异或
- 位移操作
- 计数位数
- ...

### 参考资料

- [位操作](https://zh.wikipedia.org/wiki/位操作)
- [LeetCode 位操作题目](https://leetcode-cn.com/tag/bit-manipulation/)

## 数学

本目录包含与数学算法相关的练习题目。数学算法用于解决数论、几何和代数中的问题。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 最大公约数 (GCD)
- 素数生成
- 矩阵乘法
- ...

### 参考资料

- [数学](https://zh.wikipedia.org/wiki/数学)
- [LeetCode 数学题目](https://leetcode-cn.com/tag/math/)

## 字符串

本目录包含与字符串算法相关的练习题目。字符串算法用于操作和分析文本。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- 字符串匹配
- 检测异位词
- 回文检查
- ...

### 参考资料

- [字符串 (计算机科学)](https://zh.wikipedia.org/wiki/字符串_(计算机科学))
- [LeetCode 字符串题目](https://leetcode-cn.com/tag/string/)

## 回溯

本目录包含与回溯算法相关的练习题目。回溯是一种通过探索所有可能的选项来寻找解决方案的技术。

### 题目

1. `ExampleProblem1.java`: 题目描述...
2. `ExampleProblem2.java`: 题目描述...
3. ...

### 常见算法

- N 皇后问题
- 数独求解
- 子集和问题
- ...

### 参考资料

- [回溯算法](https://zh.wikipedia.org/wiki/回溯算法)
- [LeetCode 回溯题目](https://leetcode-cn.com/tag/backtracking/)

## 贪心算法

本目录包含与贪心算法相关的练习题目。贪心算法通过在每一步选择局部最优解来寻找全局最优解。

