First results (no optimization):

```
Benchmark                                                             Mode  Cnt    Score    Error      Units
ImmutableListBenchmark.baselineFor_forEach                            avgt   25   33.605 ±  0.544      ns/op
ImmutableListBenchmark.baselineFor_forEach:CPI                        avgt    5    0.285 ±  0.006  clks/insn
ImmutableListBenchmark.baselineFor_forEach:IPC                        avgt    5    3.513 ±  0.076  insns/clk
ImmutableListBenchmark.baselineFor_forEach:L1-dcache-load-misses      avgt    5    0.003 ±  0.005       #/op
ImmutableListBenchmark.baselineFor_forEach:L1-dcache-loads            avgt    5  187.126 ±  5.048       #/op
ImmutableListBenchmark.baselineFor_forEach:L1-dcache-stores           avgt    5  131.641 ±  2.778       #/op
ImmutableListBenchmark.baselineFor_forEach:L1-icache-load-misses      avgt    5    0.010 ±  0.023       #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-load-misses            avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-loads                  avgt    5    0.002 ±  0.007       #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-store-misses           avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-stores                 avgt    5    0.002 ±  0.004       #/op
ImmutableListBenchmark.baselineFor_forEach:branch-misses              avgt    5    0.002 ±  0.001       #/op
ImmutableListBenchmark.baselineFor_forEach:branches                   avgt    5   64.659 ±  1.720       #/op
ImmutableListBenchmark.baselineFor_forEach:cycles                     avgt    5  136.555 ±  4.318       #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-load-misses           avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-loads                 avgt    5  186.779 ±  6.405       #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-store-misses          avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-stores                avgt    5  131.487 ±  3.381       #/op
ImmutableListBenchmark.baselineFor_forEach:iTLB-load-misses           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_forEach:iTLB-loads                 avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.baselineFor_forEach:instructions               avgt    5  479.735 ± 10.965       #/op
ImmutableListBenchmark.baselineFor_get                                avgt   25    7.700 ±  0.096      ns/op
ImmutableListBenchmark.baselineFor_get:CPI                            avgt    5    0.287 ±  0.006  clks/insn
ImmutableListBenchmark.baselineFor_get:IPC                            avgt    5    3.480 ±  0.077  insns/clk
ImmutableListBenchmark.baselineFor_get:L1-dcache-load-misses          avgt    5    0.001 ±  0.003       #/op
ImmutableListBenchmark.baselineFor_get:L1-dcache-loads                avgt    5   43.442 ±  1.262       #/op
ImmutableListBenchmark.baselineFor_get:L1-dcache-stores               avgt    5   18.190 ±  0.449       #/op
ImmutableListBenchmark.baselineFor_get:L1-icache-load-misses          avgt    5    0.006 ±  0.018       #/op
ImmutableListBenchmark.baselineFor_get:LLC-load-misses                avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:LLC-loads                      avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.baselineFor_get:LLC-store-misses               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:LLC-stores                     avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:branch-misses                  avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:branches                       avgt    5   16.162 ±  0.377       #/op
ImmutableListBenchmark.baselineFor_get:cycles                         avgt    5   30.733 ±  0.848       #/op
ImmutableListBenchmark.baselineFor_get:dTLB-load-misses               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:dTLB-loads                     avgt    5   43.328 ±  1.475       #/op
ImmutableListBenchmark.baselineFor_get:dTLB-store-misses              avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_get:dTLB-stores                    avgt    5   18.176 ±  0.471       #/op
ImmutableListBenchmark.baselineFor_get:iTLB-load-misses               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:iTLB-loads                     avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:instructions                   avgt    5  106.964 ±  2.287       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap                        avgt   25    2.296 ±  0.021      ns/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:CPI                    avgt    5    0.296 ±  0.002  clks/insn
ImmutableListBenchmark.baselineFor_wrap_unwrap:IPC                    avgt    5    3.383 ±  0.018  insns/clk
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-dcache-load-misses  avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-dcache-loads        avgt    5   13.094 ±  0.449       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-dcache-stores       avgt    5    6.043 ±  0.217       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-icache-load-misses  avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-load-misses        avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-loads              avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-store-misses       avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-stores             avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:branch-misses          avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:branches               avgt    5    4.025 ±  0.150       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:cycles                 avgt    5    9.207 ±  0.394       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-load-misses       avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-loads             avgt    5   13.057 ±  0.490       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-store-misses      avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-stores            avgt    5    6.030 ±  0.224       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:iTLB-load-misses       avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:iTLB-loads             avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:instructions           avgt    5   31.150 ±  1.291       #/op
ImmutableListBenchmark.forEach                                        avgt   25   36.132 ±  2.200      ns/op
ImmutableListBenchmark.forEach:CPI                                    avgt    5    0.294 ±  0.040  clks/insn
ImmutableListBenchmark.forEach:IPC                                    avgt    5    3.404 ±  0.454  insns/clk
ImmutableListBenchmark.forEach:L1-dcache-load-misses                  avgt    5    0.007 ±  0.020       #/op
ImmutableListBenchmark.forEach:L1-dcache-loads                        avgt    5  187.246 ±  8.065       #/op
ImmutableListBenchmark.forEach:L1-dcache-stores                       avgt    5  130.033 ±  4.326       #/op
ImmutableListBenchmark.forEach:L1-icache-load-misses                  avgt    5    0.014 ±  0.037       #/op
ImmutableListBenchmark.forEach:LLC-load-misses                        avgt    5    0.001 ±  0.003       #/op
ImmutableListBenchmark.forEach:LLC-loads                              avgt    5    0.003 ±  0.012       #/op
ImmutableListBenchmark.forEach:LLC-store-misses                       avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.forEach:LLC-stores                             avgt    5    0.001 ±  0.003       #/op
ImmutableListBenchmark.forEach:branch-misses                          avgt    5    0.005 ±  0.021       #/op
ImmutableListBenchmark.forEach:branches                               avgt    5   65.137 ±  2.701       #/op
ImmutableListBenchmark.forEach:cycles                                 avgt    5  141.400 ± 22.936       #/op
ImmutableListBenchmark.forEach:dTLB-load-misses                       avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.forEach:dTLB-loads                             avgt    5  187.560 ±  6.195       #/op
ImmutableListBenchmark.forEach:dTLB-store-misses                      avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.forEach:dTLB-stores                            avgt    5  130.701 ±  5.785       #/op
ImmutableListBenchmark.forEach:iTLB-load-misses                       avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.forEach:iTLB-loads                             avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.forEach:instructions                           avgt    5  480.735 ± 19.315       #/op
ImmutableListBenchmark.get                                            avgt   25   10.095 ±  1.625      ns/op
ImmutableListBenchmark.get:CPI                                        avgt    5    0.333 ±  0.338  clks/insn
ImmutableListBenchmark.get:IPC                                        avgt    5    3.135 ±  2.353  insns/clk
ImmutableListBenchmark.get:L1-dcache-load-misses                      avgt    5    0.002 ±  0.008       #/op
ImmutableListBenchmark.get:L1-dcache-loads                            avgt    5   49.244 ±  1.530       #/op
ImmutableListBenchmark.get:L1-dcache-stores                           avgt    5   18.085 ±  0.650       #/op
ImmutableListBenchmark.get:L1-icache-load-misses                      avgt    5    0.004 ±  0.009       #/op
ImmutableListBenchmark.get:LLC-load-misses                            avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:LLC-loads                                  avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.get:LLC-store-misses                           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:LLC-stores                                 avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.get:branch-misses                              avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.get:branches                                   avgt    5   19.131 ±  0.473       #/op
ImmutableListBenchmark.get:cycles                                     avgt    5   40.431 ± 40.005       #/op
ImmutableListBenchmark.get:dTLB-load-misses                           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:dTLB-loads                                 avgt    5   48.901 ±  0.906       #/op
ImmutableListBenchmark.get:dTLB-store-misses                          avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:dTLB-stores                                avgt    5   18.047 ±  0.560       #/op
ImmutableListBenchmark.get:iTLB-load-misses                           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:iTLB-loads                                 avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:instructions                               avgt    5  121.695 ±  3.413       #/op
ImmutableListBenchmark.unwrap                                         avgt   25    2.852 ±  0.045      ns/op
ImmutableListBenchmark.unwrap:CPI                                     avgt    5    0.293 ±  0.006  clks/insn
ImmutableListBenchmark.unwrap:IPC                                     avgt    5    3.412 ±  0.074  insns/clk
ImmutableListBenchmark.unwrap:L1-dcache-load-misses                   avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.unwrap:L1-dcache-loads                         avgt    5   16.165 ±  0.578       #/op
ImmutableListBenchmark.unwrap:L1-dcache-stores                        avgt    5    6.054 ±  0.233       #/op
ImmutableListBenchmark.unwrap:L1-icache-load-misses                   avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.unwrap:LLC-load-misses                         avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:LLC-loads                               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:LLC-store-misses                        avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.unwrap:LLC-stores                              avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:branch-misses                           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:branches                                avgt    5    6.056 ±  0.166       #/op
ImmutableListBenchmark.unwrap:cycles                                  avgt    5   11.220 ±  0.222       #/op
ImmutableListBenchmark.unwrap:dTLB-load-misses                        avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:dTLB-loads                              avgt    5   16.015 ±  0.627       #/op
ImmutableListBenchmark.unwrap:dTLB-store-misses                       avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.unwrap:dTLB-stores                             avgt    5    6.003 ±  0.261       #/op
ImmutableListBenchmark.unwrap:iTLB-load-misses                        avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:iTLB-loads                              avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:instructions                            avgt    5   38.282 ±  1.060       #/op
ImmutableListBenchmark.wrap                                           avgt   25    3.763 ±  0.110      ns/op
ImmutableListBenchmark.wrap:CPI                                       avgt    5    0.314 ±  0.023  clks/insn
ImmutableListBenchmark.wrap:IPC                                       avgt    5    3.187 ±  0.225  insns/clk
ImmutableListBenchmark.wrap:L1-dcache-load-misses                     avgt    5    0.259 ±  0.004       #/op
ImmutableListBenchmark.wrap:L1-dcache-loads                           avgt    5   19.204 ±  0.885       #/op
ImmutableListBenchmark.wrap:L1-dcache-stores                          avgt    5   13.142 ±  0.640       #/op
ImmutableListBenchmark.wrap:L1-icache-load-misses                     avgt    5    0.004 ±  0.005       #/op
ImmutableListBenchmark.wrap:LLC-load-misses                           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.wrap:LLC-loads                                 avgt    5    0.003 ±  0.002       #/op
ImmutableListBenchmark.wrap:LLC-store-misses                          avgt    5    0.035 ±  0.003       #/op
ImmutableListBenchmark.wrap:LLC-stores                                avgt    5    0.053 ±  0.006       #/op
ImmutableListBenchmark.wrap:branch-misses                             avgt    5    0.001 ±  0.003       #/op
ImmutableListBenchmark.wrap:branches                                  avgt    5    5.052 ±  0.123       #/op
ImmutableListBenchmark.wrap:cycles                                    avgt    5   14.542 ±  1.038       #/op
ImmutableListBenchmark.wrap:dTLB-load-misses                          avgt    5    0.004 ±  0.001       #/op
ImmutableListBenchmark.wrap:dTLB-loads                                avgt    5   18.693 ±  2.150       #/op
ImmutableListBenchmark.wrap:dTLB-store-misses                         avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.wrap:dTLB-stores                               avgt    5   12.969 ±  0.960       #/op
ImmutableListBenchmark.wrap:iTLB-load-misses                          avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.wrap:iTLB-loads                                avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.wrap:instructions                              avgt    5   46.334 ±  1.552       #/op

SlowDown
ImmutableListBenchmark.forEach 1.08 ± 0.07
ImmutableListBenchmark.get     1.31 ± 0.21
ImmutableListBenchmark.unwrap  1.24 ± 0.02
ImmutableListBenchmark.wrap    1.64 ± 0.05
```
