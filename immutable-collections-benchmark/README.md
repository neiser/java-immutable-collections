First results (no optimization):

```
Benchmark                                                             Mode  Cnt    Score    Error      Units
ImmutableListBenchmark.baselineFor_forEach                            avgt   25   33.779 ±  0.614      ns/op
ImmutableListBenchmark.baselineFor_forEach:CPI                        avgt    5    0.288 ±  0.026  clks/insn
ImmutableListBenchmark.baselineFor_forEach:IPC                        avgt    5    3.479 ±  0.300  insns/clk
ImmutableListBenchmark.baselineFor_forEach:L1-dcache-load-misses      avgt    5    0.005 ±  0.014       #/op
ImmutableListBenchmark.baselineFor_forEach:L1-dcache-loads            avgt    5  185.944 ±  3.725       #/op
ImmutableListBenchmark.baselineFor_forEach:L1-dcache-stores           avgt    5  130.817 ±  2.367       #/op
ImmutableListBenchmark.baselineFor_forEach:L1-icache-load-misses      avgt    5    0.016 ±  0.083       #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-load-misses            avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-loads                  avgt    5    0.002 ±  0.011       #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-store-misses           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_forEach:LLC-stores                 avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.baselineFor_forEach:branch-misses              avgt    5    0.003 ±  0.009       #/op
ImmutableListBenchmark.baselineFor_forEach:branches                   avgt    5   64.264 ±  0.905       #/op
ImmutableListBenchmark.baselineFor_forEach:cycles                     avgt    5  136.992 ± 11.158       #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-load-misses           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-loads                 avgt    5  186.183 ±  3.784       #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-store-misses          avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_forEach:dTLB-stores                avgt    5  130.691 ±  3.099       #/op
ImmutableListBenchmark.baselineFor_forEach:iTLB-load-misses           avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.baselineFor_forEach:iTLB-loads                 avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.baselineFor_forEach:instructions               avgt    5  476.404 ±  7.716       #/op
ImmutableListBenchmark.baselineFor_get                                avgt   25    7.656 ±  0.102      ns/op
ImmutableListBenchmark.baselineFor_get:CPI                            avgt    5    0.289 ±  0.009  clks/insn
ImmutableListBenchmark.baselineFor_get:IPC                            avgt    5    3.465 ±  0.109  insns/clk
ImmutableListBenchmark.baselineFor_get:L1-dcache-load-misses          avgt    5    0.002 ±  0.006       #/op
ImmutableListBenchmark.baselineFor_get:L1-dcache-loads                avgt    5   43.163 ±  0.829       #/op
ImmutableListBenchmark.baselineFor_get:L1-dcache-stores               avgt    5   18.099 ±  0.176       #/op
ImmutableListBenchmark.baselineFor_get:L1-icache-load-misses          avgt    5    0.003 ±  0.013       #/op
ImmutableListBenchmark.baselineFor_get:LLC-load-misses                avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:LLC-loads                      avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:LLC-store-misses               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:LLC-stores                     avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:branch-misses                  avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.baselineFor_get:branches                       avgt    5   16.049 ±  0.417       #/op
ImmutableListBenchmark.baselineFor_get:cycles                         avgt    5   30.643 ±  0.308       #/op
ImmutableListBenchmark.baselineFor_get:dTLB-load-misses               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:dTLB-loads                     avgt    5   43.100 ±  0.460       #/op
ImmutableListBenchmark.baselineFor_get:dTLB-store-misses              avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_get:dTLB-stores                    avgt    5   18.017 ±  0.241       #/op
ImmutableListBenchmark.baselineFor_get:iTLB-load-misses               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:iTLB-loads                     avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_get:instructions                   avgt    5  106.180 ±  3.167       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap                        avgt   25    2.413 ±  0.139      ns/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:CPI                    avgt    5    0.305 ±  0.021  clks/insn
ImmutableListBenchmark.baselineFor_wrap_unwrap:IPC                    avgt    5    3.284 ±  0.225  insns/clk
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-dcache-load-misses  avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-dcache-loads        avgt    5   13.075 ±  0.533       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-dcache-stores       avgt    5    6.015 ±  0.242       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:L1-icache-load-misses  avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-load-misses        avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-loads              avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-store-misses       avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:LLC-stores             avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:branch-misses          avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:branches               avgt    5    4.025 ±  0.186       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:cycles                 avgt    5    9.476 ±  0.685       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-load-misses       avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-loads             avgt    5   12.970 ±  0.700       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-store-misses      avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:dTLB-stores            avgt    5    5.990 ±  0.334       #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:iTLB-load-misses       avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:iTLB-loads             avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.baselineFor_wrap_unwrap:instructions           avgt    5   31.113 ±  1.490       #/op
ImmutableListBenchmark.forEach                                        avgt   25   49.049 ±  0.361      ns/op
ImmutableListBenchmark.forEach:CPI                                    avgt    5    0.300 ±  0.013  clks/insn
ImmutableListBenchmark.forEach:IPC                                    avgt    5    3.338 ±  0.141  insns/clk
ImmutableListBenchmark.forEach:L1-dcache-load-misses                  avgt    5    0.300 ±  0.071       #/op
ImmutableListBenchmark.forEach:L1-dcache-loads                        avgt    5  208.725 ±  8.322       #/op
ImmutableListBenchmark.forEach:L1-dcache-stores                       avgt    5  104.889 ±  6.986       #/op
ImmutableListBenchmark.forEach:L1-icache-load-misses                  avgt    5    0.029 ±  0.046       #/op
ImmutableListBenchmark.forEach:LLC-load-misses                        avgt    5    0.001 ±  0.003       #/op
ImmutableListBenchmark.forEach:LLC-loads                              avgt    5    0.024 ±  0.100       #/op
ImmutableListBenchmark.forEach:LLC-store-misses                       avgt    5    0.010 ±  0.005       #/op
ImmutableListBenchmark.forEach:LLC-stores                             avgt    5    0.032 ±  0.032       #/op
ImmutableListBenchmark.forEach:branch-misses                          avgt    5    0.018 ±  0.046       #/op
ImmutableListBenchmark.forEach:branches                               avgt    5  108.382 ±  5.756       #/op
ImmutableListBenchmark.forEach:cycles                                 avgt    5  195.517 ±  6.194       #/op
ImmutableListBenchmark.forEach:dTLB-load-misses                       avgt    5    0.005 ±  0.003       #/op
ImmutableListBenchmark.forEach:dTLB-loads                             avgt    5  209.722 ± 10.972       #/op
ImmutableListBenchmark.forEach:dTLB-store-misses                      avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.forEach:dTLB-stores                            avgt    5  106.293 ±  2.843       #/op
ImmutableListBenchmark.forEach:iTLB-load-misses                       avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.forEach:iTLB-loads                             avgt    5    0.001 ±  0.003       #/op
ImmutableListBenchmark.forEach:instructions                           avgt    5  652.685 ± 34.836       #/op
ImmutableListBenchmark.get                                            avgt   25   44.484 ±  1.792      ns/op
ImmutableListBenchmark.get:CPI                                        avgt    5    0.289 ±  0.063  clks/insn
ImmutableListBenchmark.get:IPC                                        avgt    5    3.470 ±  0.700  insns/clk
ImmutableListBenchmark.get:L1-dcache-load-misses                      avgt    5    0.005 ±  0.011       #/op
ImmutableListBenchmark.get:L1-dcache-loads                            avgt    5  181.634 ± 22.488       #/op
ImmutableListBenchmark.get:L1-dcache-stores                           avgt    5   40.833 ±  5.274       #/op
ImmutableListBenchmark.get:L1-icache-load-misses                      avgt    5    0.015 ±  0.031       #/op
ImmutableListBenchmark.get:LLC-load-misses                            avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.get:LLC-loads                                  avgt    5    0.003 ±  0.009       #/op
ImmutableListBenchmark.get:LLC-store-misses                           avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:LLC-stores                                 avgt    5    0.001 ±  0.005       #/op
ImmutableListBenchmark.get:branch-misses                              avgt    5    0.004 ±  0.021       #/op
ImmutableListBenchmark.get:branches                                   avgt    5  115.828 ±  1.704       #/op
ImmutableListBenchmark.get:cycles                                     avgt    5  180.503 ± 41.377       #/op
ImmutableListBenchmark.get:dTLB-load-misses                           avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.get:dTLB-loads                                 avgt    5  181.408 ± 19.818       #/op
ImmutableListBenchmark.get:dTLB-store-misses                          avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get:dTLB-stores                                avgt    5   40.897 ±  5.042       #/op
ImmutableListBenchmark.get:iTLB-load-misses                           avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.get:iTLB-loads                                 avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.get:instructions                               avgt    5  624.778 ± 10.451       #/op
ImmutableListBenchmark.get_noop                                       avgt   25   26.684 ±  0.220      ns/op
ImmutableListBenchmark.get_noop:CPI                                   avgt    5    0.294 ±  0.010  clks/insn
ImmutableListBenchmark.get_noop:IPC                                   avgt    5    3.397 ±  0.111  insns/clk
ImmutableListBenchmark.get_noop:L1-dcache-load-misses                 avgt    5    1.163 ±  0.028       #/op
ImmutableListBenchmark.get_noop:L1-dcache-loads                       avgt    5  133.361 ±  4.528       #/op
ImmutableListBenchmark.get_noop:L1-dcache-stores                      avgt    5   46.631 ±  1.320       #/op
ImmutableListBenchmark.get_noop:L1-icache-load-misses                 avgt    5    0.033 ±  0.067       #/op
ImmutableListBenchmark.get_noop:LLC-load-misses                       avgt    5    0.001 ±  0.004       #/op
ImmutableListBenchmark.get_noop:LLC-loads                             avgt    5    0.016 ±  0.030       #/op
ImmutableListBenchmark.get_noop:LLC-store-misses                      avgt    5    0.101 ±  0.014       #/op
ImmutableListBenchmark.get_noop:LLC-stores                            avgt    5    0.184 ±  0.041       #/op
ImmutableListBenchmark.get_noop:branch-misses                         avgt    5    0.003 ±  0.011       #/op
ImmutableListBenchmark.get_noop:branches                              avgt    5   58.681 ±  1.685       #/op
ImmutableListBenchmark.get_noop:cycles                                avgt    5  106.566 ±  2.763       #/op
ImmutableListBenchmark.get_noop:dTLB-load-misses                      avgt    5    0.020 ±  0.009       #/op
ImmutableListBenchmark.get_noop:dTLB-loads                            avgt    5  132.408 ±  6.801       #/op
ImmutableListBenchmark.get_noop:dTLB-store-misses                     avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.get_noop:dTLB-stores                           avgt    5   46.171 ±  2.460       #/op
ImmutableListBenchmark.get_noop:iTLB-load-misses                      avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.get_noop:iTLB-loads                            avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.get_noop:instructions                          avgt    5  362.023 ±  8.943       #/op
ImmutableListBenchmark.unwrap                                         avgt   25    4.518 ±  0.034      ns/op
ImmutableListBenchmark.unwrap:CPI                                     avgt    5    0.288 ±  0.016  clks/insn
ImmutableListBenchmark.unwrap:IPC                                     avgt    5    3.476 ±  0.193  insns/clk
ImmutableListBenchmark.unwrap:L1-dcache-load-misses                   avgt    5    0.001 ±  0.002       #/op
ImmutableListBenchmark.unwrap:L1-dcache-loads                         avgt    5   26.057 ±  0.577       #/op
ImmutableListBenchmark.unwrap:L1-dcache-stores                        avgt    5    8.039 ±  0.139       #/op
ImmutableListBenchmark.unwrap:L1-icache-load-misses                   avgt    5    0.002 ±  0.008       #/op
ImmutableListBenchmark.unwrap:LLC-load-misses                         avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:LLC-loads                               avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:LLC-store-misses                        avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.unwrap:LLC-stores                              avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:branch-misses                           avgt    5   ≈ 10⁻³                #/op
ImmutableListBenchmark.unwrap:branches                                avgt    5   10.031 ±  0.232       #/op
ImmutableListBenchmark.unwrap:cycles                                  avgt    5   18.186 ±  1.198       #/op
ImmutableListBenchmark.unwrap:dTLB-load-misses                        avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:dTLB-loads                              avgt    5   25.980 ±  0.853       #/op
ImmutableListBenchmark.unwrap:dTLB-store-misses                       avgt    5   ≈ 10⁻⁵                #/op
ImmutableListBenchmark.unwrap:dTLB-stores                             avgt    5    8.007 ±  0.215       #/op
ImmutableListBenchmark.unwrap:iTLB-load-misses                        avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:iTLB-loads                              avgt    5   ≈ 10⁻⁴                #/op
ImmutableListBenchmark.unwrap:instructions                            avgt    5   63.201 ±  1.393       #/op
ImmutableListBenchmark.wrap                                           avgt   25   37.344 ±  0.319      ns/op
ImmutableListBenchmark.wrap:CPI                                       avgt    5    0.281 ±  0.011  clks/insn
ImmutableListBenchmark.wrap:IPC                                       avgt    5    3.557 ±  0.141  insns/clk
ImmutableListBenchmark.wrap:L1-dcache-load-misses                     avgt    5    2.716 ±  0.054       #/op
ImmutableListBenchmark.wrap:L1-dcache-loads                           avgt    5  129.702 ±  5.895       #/op
ImmutableListBenchmark.wrap:L1-dcache-stores                          avgt    5   79.026 ±  2.452       #/op
ImmutableListBenchmark.wrap:L1-icache-load-misses                     avgt    5    0.043 ±  0.038       #/op
ImmutableListBenchmark.wrap:LLC-load-misses                           avgt    5    0.003 ±  0.005       #/op
ImmutableListBenchmark.wrap:LLC-loads                                 avgt    5    0.033 ±  0.033       #/op
ImmutableListBenchmark.wrap:LLC-store-misses                          avgt    5    0.347 ±  0.020       #/op
ImmutableListBenchmark.wrap:LLC-stores                                avgt    5    0.713 ±  0.038       #/op
ImmutableListBenchmark.wrap:branch-misses                             avgt    5    0.006 ±  0.014       #/op
ImmutableListBenchmark.wrap:branches                                  avgt    5   84.823 ±  6.914       #/op
ImmutableListBenchmark.wrap:cycles                                    avgt    5  147.996 ±  7.578       #/op
ImmutableListBenchmark.wrap:dTLB-load-misses                          avgt    5    0.045 ±  0.008       #/op
ImmutableListBenchmark.wrap:dTLB-loads                                avgt    5  129.000 ±  3.585       #/op
ImmutableListBenchmark.wrap:dTLB-store-misses                         avgt    5    0.001 ±  0.001       #/op
ImmutableListBenchmark.wrap:dTLB-stores                               avgt    5   78.735 ±  5.277       #/op
ImmutableListBenchmark.wrap:iTLB-load-misses                          avgt    5    0.002 ±  0.005       #/op
ImmutableListBenchmark.wrap:iTLB-loads                                avgt    5    0.003 ±  0.003       #/op
ImmutableListBenchmark.wrap:instructions                              avgt    5  526.475 ± 35.521       #/op

SlowDown
ImmutableListBenchmark.forEach  1.45 ± 0.03
ImmutableListBenchmark.get      5.81 ± 0.25
ImmutableListBenchmark.get_noop 3.49 ± 0.05
ImmutableListBenchmark.unwrap   1.87 ± 0.11
ImmutableListBenchmark.wrap     15.47 ± 0.90
```
