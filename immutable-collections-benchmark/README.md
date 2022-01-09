First results (no optimization):

```
Benchmark                                                 Mode  Cnt    Score    Error      Units
MutableListBenchmark.get                                  avgt   25   15.922 ±  0.652      ns/op
MutableListBenchmark.get:CPI                              avgt    5    0.307 ±  0.011  clks/insn
MutableListBenchmark.get:IPC                              avgt    5    3.256 ±  0.113  insns/clk
MutableListBenchmark.get:L1-dcache-load-misses            avgt    5    0.079 ±  0.660       #/op
MutableListBenchmark.get:L1-dcache-loads                  avgt    5   61.027 ± 18.916       #/op
MutableListBenchmark.get:L1-dcache-stores                 avgt    5   15.666 ± 11.915       #/op
MutableListBenchmark.get:L1-icache-load-misses            avgt    5    0.008 ±  0.030       #/op
MutableListBenchmark.get:LLC-load-misses                  avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.get:LLC-loads                        avgt    5    0.003 ±  0.017       #/op
MutableListBenchmark.get:LLC-store-misses                 avgt    5    0.004 ±  0.036       #/op
MutableListBenchmark.get:LLC-stores                       avgt    5    0.010 ±  0.077       #/op
MutableListBenchmark.get:branch-misses                    avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.get:branches                         avgt    5   40.137 ±  8.940       #/op
MutableListBenchmark.get:cycles                           avgt    5   65.153 ± 12.207       #/op
MutableListBenchmark.get:dTLB-load-misses                 avgt    5    0.001 ±  0.011       #/op
MutableListBenchmark.get:dTLB-loads                       avgt    5   60.755 ± 18.441       #/op
MutableListBenchmark.get:dTLB-store-misses                avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get:dTLB-stores                      avgt    5   15.609 ± 11.825       #/op
MutableListBenchmark.get:iTLB-load-misses                 avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get:iTLB-loads                       avgt    5    0.001 ±  0.001       #/op
MutableListBenchmark.get:instructions                     avgt    5  212.078 ± 36.478       #/op
MutableListBenchmark.get_baseline                         avgt   25    2.732 ±  0.013      ns/op
MutableListBenchmark.get_baseline:CPI                     avgt    5    0.309 ±  0.010  clks/insn
MutableListBenchmark.get_baseline:IPC                     avgt    5    3.240 ±  0.107  insns/clk
MutableListBenchmark.get_baseline:L1-dcache-load-misses   avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:L1-dcache-loads         avgt    5   15.076 ±  0.664       #/op
MutableListBenchmark.get_baseline:L1-dcache-stores        avgt    5    6.021 ±  0.286       #/op
MutableListBenchmark.get_baseline:L1-icache-load-misses   avgt    5    0.001 ±  0.001       #/op
MutableListBenchmark.get_baseline:LLC-load-misses         avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:LLC-loads               avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:LLC-store-misses        avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:LLC-stores              avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:branch-misses           avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:branches                avgt    5    5.019 ±  0.222       #/op
MutableListBenchmark.get_baseline:cycles                  avgt    5   11.145 ±  0.533       #/op
MutableListBenchmark.get_baseline:dTLB-load-misses        avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:dTLB-loads              avgt    5   15.043 ±  0.349       #/op
MutableListBenchmark.get_baseline:dTLB-store-misses       avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.get_baseline:dTLB-stores             avgt    5    6.025 ±  0.177       #/op
MutableListBenchmark.get_baseline:iTLB-load-misses        avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:iTLB-loads              avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_baseline:instructions            avgt    5   36.112 ±  1.482       #/op
MutableListBenchmark.get_noop                             avgt   25    9.162 ±  0.040      ns/op
MutableListBenchmark.get_noop:CPI                         avgt    5    0.297 ±  0.010  clks/insn
MutableListBenchmark.get_noop:IPC                         avgt    5    3.365 ±  0.115  insns/clk
MutableListBenchmark.get_noop:L1-dcache-load-misses       avgt    5    0.389 ±  0.011       #/op
MutableListBenchmark.get_noop:L1-dcache-loads             avgt    5   42.698 ±  1.373       #/op
MutableListBenchmark.get_noop:L1-dcache-stores            avgt    5   14.191 ±  0.401       #/op
MutableListBenchmark.get_noop:L1-icache-load-misses       avgt    5    0.011 ±  0.023       #/op
MutableListBenchmark.get_noop:LLC-load-misses             avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.get_noop:LLC-loads                   avgt    5    0.005 ±  0.010       #/op
MutableListBenchmark.get_noop:LLC-store-misses            avgt    5    0.033 ±  0.006       #/op
MutableListBenchmark.get_noop:LLC-stores                  avgt    5    0.059 ±  0.003       #/op
MutableListBenchmark.get_noop:branch-misses               avgt    5    0.001 ±  0.006       #/op
MutableListBenchmark.get_noop:branches                    avgt    5   20.227 ±  1.048       #/op
MutableListBenchmark.get_noop:cycles                      avgt    5   36.848 ±  1.228       #/op
MutableListBenchmark.get_noop:dTLB-load-misses            avgt    5    0.007 ±  0.002       #/op
MutableListBenchmark.get_noop:dTLB-loads                  avgt    5   42.071 ±  2.340       #/op
MutableListBenchmark.get_noop:dTLB-store-misses           avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.get_noop:dTLB-stores                 avgt    5   14.032 ±  0.431       #/op
MutableListBenchmark.get_noop:iTLB-load-misses            avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.get_noop:iTLB-loads                  avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.get_noop:instructions                avgt    5  124.010 ±  6.771       #/op
MutableListBenchmark.wrap                                 avgt   25   37.182 ±  0.320      ns/op
MutableListBenchmark.wrap:CPI                             avgt    5    0.284 ±  0.016  clks/insn
MutableListBenchmark.wrap:IPC                             avgt    5    3.516 ±  0.191  insns/clk
MutableListBenchmark.wrap:L1-dcache-load-misses           avgt    5    2.722 ±  0.104       #/op
MutableListBenchmark.wrap:L1-dcache-loads                 avgt    5  129.270 ±  5.344       #/op
MutableListBenchmark.wrap:L1-dcache-stores                avgt    5   78.918 ±  4.597       #/op
MutableListBenchmark.wrap:L1-icache-load-misses           avgt    5    0.054 ±  0.104       #/op
MutableListBenchmark.wrap:LLC-load-misses                 avgt    5    0.003 ±  0.006       #/op
MutableListBenchmark.wrap:LLC-loads                       avgt    5    0.038 ±  0.063       #/op
MutableListBenchmark.wrap:LLC-store-misses                avgt    5    0.352 ±  0.033       #/op
MutableListBenchmark.wrap:LLC-stores                      avgt    5    0.720 ±  0.067       #/op
MutableListBenchmark.wrap:branch-misses                   avgt    5    0.005 ±  0.010       #/op
MutableListBenchmark.wrap:branches                        avgt    5   84.550 ±  4.042       #/op
MutableListBenchmark.wrap:cycles                          avgt    5  149.255 ± 12.133       #/op
MutableListBenchmark.wrap:dTLB-load-misses                avgt    5    0.046 ±  0.014       #/op
MutableListBenchmark.wrap:dTLB-loads                      avgt    5  127.024 ±  7.025       #/op
MutableListBenchmark.wrap:dTLB-store-misses               avgt    5    0.001 ±  0.001       #/op
MutableListBenchmark.wrap:dTLB-stores                     avgt    5   78.138 ±  2.454       #/op
MutableListBenchmark.wrap:iTLB-load-misses                avgt    5    0.001 ±  0.004       #/op
MutableListBenchmark.wrap:iTLB-loads                      avgt    5    0.003 ±  0.003       #/op
MutableListBenchmark.wrap:instructions                    avgt    5  524.747 ± 27.145       #/op
MutableListBenchmark.wrap_baseline                        avgt   25    2.270 ±  0.009      ns/op
MutableListBenchmark.wrap_baseline:CPI                    avgt    5    0.296 ±  0.002  clks/insn
MutableListBenchmark.wrap_baseline:IPC                    avgt    5    3.381 ±  0.024  insns/clk
MutableListBenchmark.wrap_baseline:L1-dcache-load-misses  avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.wrap_baseline:L1-dcache-loads        avgt    5   13.002 ±  0.234       #/op
MutableListBenchmark.wrap_baseline:L1-dcache-stores       avgt    5    6.006 ±  0.101       #/op
MutableListBenchmark.wrap_baseline:L1-icache-load-misses  avgt    5   ≈ 10⁻³                #/op
MutableListBenchmark.wrap_baseline:LLC-load-misses        avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.wrap_baseline:LLC-loads              avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:LLC-store-misses       avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.wrap_baseline:LLC-stores             avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:branch-misses          avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:branches               avgt    5    4.005 ±  0.092       #/op
MutableListBenchmark.wrap_baseline:cycles                 avgt    5    9.171 ±  0.167       #/op
MutableListBenchmark.wrap_baseline:dTLB-load-misses       avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.wrap_baseline:dTLB-loads             avgt    5   12.973 ±  0.358       #/op
MutableListBenchmark.wrap_baseline:dTLB-store-misses      avgt    5   ≈ 10⁻⁵                #/op
MutableListBenchmark.wrap_baseline:dTLB-stores            avgt    5    5.992 ±  0.160       #/op
MutableListBenchmark.wrap_baseline:iTLB-load-misses       avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:iTLB-loads             avgt    5   ≈ 10⁻⁴                #/op
MutableListBenchmark.wrap_baseline:instructions           avgt    5   31.009 ±  0.704       #/op

SlowDown
MutableListBenchmark.get_noop 3.35 ± 0.02
MutableListBenchmark.get      5.83 ± 0.24
MutableListBenchmark.wrap     16.38 ± 0.16
```
