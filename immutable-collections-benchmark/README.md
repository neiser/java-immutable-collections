First results (no optimization):

```
Benchmark                                                 Mode  Cnt    Score    Error      Units
MutableListBenchmark.get                                  avgt   25   15.776 ±  0.511      ns/op
MutableListBenchmark.get:CPI                              avgt    5    0.297 ±  0.046  clks/insn
MutableListBenchmark.get:IPC                              avgt    5    3.370 ±  0.540  insns/clk
MutableListBenchmark.get:L1-dcache-load-misses            avgt    5    0.083 ±  0.669       #/op
MutableListBenchmark.get:L1-dcache-loads                  avgt    5   60.449 ± 12.175       #/op
MutableListBenchmark.get:L1-dcache-stores                 avgt    5   15.307 ±  8.031       #/op
MutableListBenchmark.get:L1-icache-load-misses            avgt    5    0.005 ±  0.011       #/op
MutableListBenchmark.get:LLC-load-misses                  avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get:LLC-loads                        avgt    5    0.002 ±  0.005       #/op
MutableListBenchmark.get:LLC-store-misses                 avgt    5    0.004 ±  0.036       #/op
MutableListBenchmark.get:LLC-stores                       avgt    5    0.009 ±  0.076       #/op
MutableListBenchmark.get:branch-misses                    avgt    5    0.001 ±  0.005       #/op
MutableListBenchmark.get:branches                         avgt    5   40.201 ±  6.247       #/op
MutableListBenchmark.get:cycles                           avgt    5   62.712 ±  4.894       #/op
MutableListBenchmark.get:dTLB-load-misses                 avgt    5    0.001 ±  0.011       #/op
MutableListBenchmark.get:dTLB-loads                       avgt    5   59.919 ± 12.590       #/op
MutableListBenchmark.get:dTLB-store-misses                avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get:dTLB-stores                      avgt    5   15.192 ±  8.248       #/op
MutableListBenchmark.get:iTLB-load-misses                 avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get:iTLB-loads                       avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get:instructions                     avgt    5  211.264 ± 32.247       #/op
MutableListBenchmark.get_baseline                         avgt   25    2.805 ±  0.030      ns/op
MutableListBenchmark.get_baseline:CPI                     avgt    5    0.307 ±  0.005  clks/insn
MutableListBenchmark.get_baseline:IPC                     avgt    5    3.253 ±  0.052  insns/clk
MutableListBenchmark.get_baseline:L1-dcache-load-misses   avgt    5    0.001 ±  0.003       #/op
MutableListBenchmark.get_baseline:L1-dcache-loads         avgt    5   15.177 ±  0.659       #/op
MutableListBenchmark.get_baseline:L1-dcache-stores        avgt    5    6.054 ±  0.249       #/op
MutableListBenchmark.get_baseline:L1-icache-load-misses   avgt    5    0.001 ±  0.003       #/op
MutableListBenchmark.get_baseline:LLC-load-misses         avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:LLC-loads               avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:LLC-store-misses        avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:LLC-stores              avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:branch-misses           avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:branches                avgt    5    5.064 ±  0.192       #/op
MutableListBenchmark.get_baseline:cycles                  avgt    5   11.211 ±  0.542       #/op
MutableListBenchmark.get_baseline:dTLB-load-misses        avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:dTLB-loads              avgt    5   15.123 ±  0.280       #/op
MutableListBenchmark.get_baseline:dTLB-store-misses       avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:dTLB-stores             avgt    5    6.061 ±  0.121       #/op
MutableListBenchmark.get_baseline:iTLB-load-misses        avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:iTLB-loads              avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:instructions            avgt    5   36.465 ±  1.452       #/op
MutableListBenchmark.wrap                                 avgt   25   44.293 ±  0.734      ns/op
MutableListBenchmark.wrap:CPI                             avgt    5    0.295 ±  0.008  clks/insn
MutableListBenchmark.wrap:IPC                             avgt    5    3.386 ±  0.090  insns/clk
MutableListBenchmark.wrap:L1-dcache-load-misses           avgt    5    3.023 ±  0.790       #/op
MutableListBenchmark.wrap:L1-dcache-loads                 avgt    5  152.425 ±  7.186       #/op
MutableListBenchmark.wrap:L1-dcache-stores                avgt    5   93.439 ± 14.300       #/op
MutableListBenchmark.wrap:L1-icache-load-misses           avgt    5    0.067 ±  0.139       #/op
MutableListBenchmark.wrap:LLC-load-misses                 avgt    5    0.004 ±  0.007       #/op
MutableListBenchmark.wrap:LLC-loads                       avgt    5    0.042 ±  0.063       #/op
MutableListBenchmark.wrap:LLC-store-misses                avgt    5    0.379 ±  0.188       #/op
MutableListBenchmark.wrap:LLC-stores                      avgt    5    0.748 ±  0.321       #/op
MutableListBenchmark.wrap:branch-misses                   avgt    5    0.008 ±  0.015       #/op
MutableListBenchmark.wrap:branches                        avgt    5   89.584 ± 22.712       #/op
MutableListBenchmark.wrap:cycles                          avgt    5  175.239 ±  9.715       #/op
MutableListBenchmark.wrap:dTLB-load-misses                avgt    5    0.049 ±  0.016       #/op
MutableListBenchmark.wrap:dTLB-loads                      avgt    5  151.226 ± 10.012       #/op
MutableListBenchmark.wrap:dTLB-store-misses               avgt    5    0.001 ±  0.001       #/op
MutableListBenchmark.wrap:dTLB-stores                     avgt    5   92.824 ± 17.362       #/op
MutableListBenchmark.wrap:iTLB-load-misses                avgt    5    0.002 ±  0.003       #/op
MutableListBenchmark.wrap:iTLB-loads                      avgt    5    0.003 ±  0.002       #/op
MutableListBenchmark.wrap:instructions                    avgt    5  593.385 ± 44.884       #/op
MutableListBenchmark.wrap_baseline                        avgt   25    2.338 ±  0.030      ns/op
MutableListBenchmark.wrap_baseline:CPI                    avgt    5    0.298 ±  0.006  clks/insn
MutableListBenchmark.wrap_baseline:IPC                    avgt    5    3.354 ±  0.070  insns/clk
MutableListBenchmark.wrap_baseline:L1-dcache-load-misses  avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.wrap_baseline:L1-dcache-loads        avgt    5   13.067 ±  0.417       #/op
MutableListBenchmark.wrap_baseline:L1-dcache-stores       avgt    5    6.024 ±  0.214       #/op
MutableListBenchmark.wrap_baseline:L1-icache-load-misses  avgt    5    0.001 ±  0.001       #/op
MutableListBenchmark.wrap_baseline:LLC-load-misses        avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:LLC-loads              avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:LLC-store-misses       avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.wrap_baseline:LLC-stores             avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:branch-misses          avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:branches               avgt    5    4.017 ±  0.145       #/op
MutableListBenchmark.wrap_baseline:cycles                 avgt    5    9.270 ±  0.230       #/op
MutableListBenchmark.wrap_baseline:dTLB-load-misses       avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.wrap_baseline:dTLB-loads             avgt    5   13.000 ±  0.326       #/op
MutableListBenchmark.wrap_baseline:dTLB-store-misses      avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.wrap_baseline:dTLB-stores            avgt    5    6.005 ±  0.147       #/op
MutableListBenchmark.wrap_baseline:iTLB-load-misses       avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:iTLB-loads             avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:instructions           avgt    5   31.090 ±  1.055       #/op

SlowDown
MutableListBenchmark.get  5.62 ± 0.19
MutableListBenchmark.wrap 18.94 ± 0.40
```
